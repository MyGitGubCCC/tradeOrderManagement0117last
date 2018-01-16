<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
    <!--引入JQuery EasyUI所需的js和css-->
    <meta charset="UTF-8" />
    <!--引入jQuery 核心库，这里采用的是2.0-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.3/jquery.min.js"></script>
    <!--引入jQuery EasyUI 核心库，这里采用的是1.5.3-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.3/jquery.easyui.min.js"></script>
    <!--引入EasyUI 中文提示信息-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.3/locale/easyui-lang-zh_CN.js" ></script>
    <!--引入EasyUI 核心UI 文件CSS-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/default/easyui.css" />

    <%--引入自定义的js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/checkCreditlimit-js.js" ></script>
    <%--省市区联动js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/linq.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/citiselect.js" ></script>

    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="销售清单列表" >
    <div id="tb">
        销售清单编号：<input class="easyui-textbox" name="consigneeno" id="consigneenodel" style="width:150px;"/>

        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
    </div>
    <div>
        <table id="departmentsdg" class="easyui-datagrid" toolbar="#tb" style="width:100%;height: auto;"
               data-options="rownumbers:true,singleSelect:true,pagination:true,method:'get'">
            <thead>
            <tr>
                <th data-options="field:'consigneeno'" width="20%" align="center">销售清单编号</th>
                <th data-options="field:'ordertime'" width="15%" align="center">订单提交时间</th>
                <th data-options="field:'rows.purchaseunit.name',formatter:purchaseunitName" width="20%" align="center">购买单位</th>
                <th data-options="field:'paymenttime'" width="10%" align="center">付款时间</th>
                <th data-options="field:'rows.purchaseunit.creditlimit.finalreviewdate',formatter:finalreviewdate" width="15%" align="center">签注信用额度时间</th>
                <th data-options="field:'_operate',formatter:formatOper" width="10%" align="center">操作</th>
            </tr>
            </thead>
        </table>
    </div>
</div>

<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="dlg" class="easyui-dialog" style="width: 60%; height: 80%; padding: 10px 20px"
     data-options="closed:true,buttons:'#dlg-buttons'">
    <form id="fm" method="post">
        <table id="datagrid" style="width:auto;height: auto;">
            <tr>
                <td colspan="6"><label >销售清单编号：</label>
                    <input class="easyui-textbox" style="width:600px;" readonly="readonly" name="consigneeno" id="consigneeno" value=""/>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    <label >商品名称：</label>
                    <input type="hidden" readonly="readonly" required="true" name="saleslistid" id="saleslistid" value=""/>
                    <input type="hidden" readonly="readonly" required="true" name="purchaseunitid" id="purchaseunitid" value=""/>
                    <input style="width:150px;"id="commodityname" readonly="readonly" name="commodityname" class="easyui-combox"
                           data-options="valueField:'id',textField:'orgName',data:[{id:'goodA',orgName:'货物1'},{id:'goodB',orgName:'货物2'},{id:'goodC',orgName:'货物3'}]">
                    <label >单价：</label>
                    <input class="easyui-textbox" style="width:70px;" readonly="readonly" name="commodityprice2" id="commodityprice2" value=""/>
                    <label > 数量：</label>
                    <input class="easyui-numberspinner" readonly="readonly"  id="ammount" name="ammount" data-options="min:1,max:100,required:true" style="width:60px;"/>
                    <label >单位：</label>
                    <input class="easyui-textbox" style="width:50px;" readonly="readonly" name="specification" id="specification" value="吨"/>
                    <label >总价：</label>
                    <input class="easyui-textbox" style="width:90px;" readonly="readonly" name="commodityprice" id="commodityprice" value="0"/>
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    <label>购买单位信息：</label>
                </td>
            </tr>
            <tr>
                <td >购买单位：</td>
                <td><input class="easyui-textbox" readonly="readonly"  required="true" name="name" id="name1" value=""/></td>
                <td >单位地址：</td>
                <td><input class="easyui-textbox" readonly="readonly"  required="true" name="place" id="place" value=""/></td>
                <td >联系方式：</td>
                <td>
                    <input class="easyui-textbox" readonly="readonly"  style="width:140px;"required="true" name="contactInformation" id="contactInformation" value=""/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>支付方式：</label>
                </td>
                <td>
                    <input id="paymentId" style="width:150px;" readonly="readonly"
                           url="allPaymentmethod.action"
                           name="paymentmethodid"
                           valueField="paymentmethodid" textField="name">
                    </input>
                </td>
                <td>
                    <label>会员名称：</label>
                </td>
                <td>
                    <input id="memberId" style="width:150px;" readonly="readonly"
                           url="allMember.action"
                           name="memberid"
                           valueField="memberid" textField="name">
                    </input>
                </td>
                <td colspan="2">
                    <label>期待收货时间：</label>
                    <input id="expectdeliverydate" readonly="readonly"  name="expectdeliverydate" style="width:105px;" type="text" class="easyui-datebox" required="required">
                </td>
            </tr>
            <tr>
                <td>
                    <label>应付款：</label>
                </td>
                <td>
                    <input class="easyui-textbox" readonly="readonly" name="due" id="due" value="0"/>
                </td>
                <td rowspan="2" >
                    <label>买方留言：</label>
                </td>
                <td rowspan="2" colspan="3">
                    <input class="easyui-textbox" readonly="readonly"  name="description" id="description" data-options="multiline:true" value="" style="width:380px;height: 100%;">
                </td>
            </tr>
            <tr>
                <td>
                    <label>实付款：</label>
                </td>
                <td>
                    <input class="easyui-textbox" readonly="readonly"   name="actualpayment" id="actualpayment" value=""/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>付款时间：</label>
                </td>
                <td>
                    <input id="paymenttime" name="paymenttime" readonly="readonly"  style="width:150px;" type="text"
                           class="easyui-datebox" required="required">
                    <%--<input class="easyui-textbox"  name="finalreviewdate" id="finalreviewdate" value=""/>--%>
                </td>
            </tr>
            <tr>
                <td>
                    <label>注意事项：</label>
                </td>
                <td colspan="5">
                    <input class="easyui-textbox" readonly="readonly" name="notes" id="notes" data-options="multiline:true" value="" style="width:100%;height:50px;">
                </td>
            </tr>
            <tr>
                <td>
                    <label>营销部门</br>签核意见：</label>
                </td>
                <td colspan="5">
                    <input class="easyui-textbox" name="checkOpinion" id="checkOpinion" data-options="multiline:true" value="" style="width:100%;height:50px;">
                </td>
            </tr>
            <tr>
                <td colspan="6">
                    <label>签注客户信用额度：</label>
                </td>
            </tr>
            <tr>
                <td>
                    <label>交易时间：</label>
                </td>
                <td>
                    <input class="easyui-textbox" readonly="readonly"  name="ordertime" id="ordertime" value=""/>
                </td>
                <td>
                    <label>签注会计：</label>
                </td>
                <td>
                    <input type="hidden" readonly="readonly" required="true" name="employeeid" id="employeeid" value="${sessionScope.get('employee').employeeid}"/>
                    <input class="easyui-textbox" readonly="readonly"   name="employeeName" id="employeeName" value="${sessionScope.get('employee').name}"/>
                </td>
                <td>
                    <label>客户资本：</label>
                </td>
                <td>
                    <input class="easyui-textbox" readonly="readonly" name="customercapital" id="customercapital" value=""/>
                </td>
            </tr>
            <tr>
                <td>
                    <label>客户信用</br>额度描述：</label>
                </td>
                <td colspan="5">
                    <input class="easyui-textbox" readonly="readonly" name="creditsituationdescription" id="creditsituationdescription" data-options="multiline:true" value="" style="width:100%;height:50px;">
                </td>
            </tr>
            <tr>
                <td>
                    <label>审核信用</br>额度意见：</label>
                    <input type="hidden" readonly="readonly" required="true" name="creditlimitid" id="creditlimitid" value=""/>
                </td>
                <td colspan="5">
                    <input class="easyui-textbox"  name="customername" id="customername" data-options="multiline:true" value="" style="width:100%;height:50px;">
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser(6)">同意</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="closeDialog()">关闭</a>
</div>
<script type="text/javascript">
    $('#cc').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.departmentno+"-"+row.departmentname+'</span>';
        }
    });
    $('#ccc').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.departmentno+"-"+row.departmentname+'</span>';
        }
    });
    $('#distributionId').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.name+'</span>';
        }
    });
    $('#paymentId').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.name+'</span>';
        }
    });
    $('#memberId').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.name+'</span>';
        }
    });

    $('#orderstatus111').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.text+'</span>';
        }
    });


    function purchaseunitName(value, rec) { return rec.purchaseunit.name != null ? rec.purchaseunit.name : ""; }

    function finalreviewdate(value, rec) { return rec.purchaseunit.creditlimit.finalreviewdate != null ? rec.purchaseunit.creditlimit.finalreviewdate : ""; }

</script>

</body>
</html>
