<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>consignmentlist</title>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/consignment-js.js"></script>
    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="托运单" >
    <div id="tb">
        托运单编号：<input class="easyui-textbox" name="consignmentListNo" id="consignmentListNo" style="width:150px;height:32px"/>
        员工：<input class="easyui-textbox" name="employeeName" id="employeeName" style="width:150px;height:32px"/>
        收货方：<input class="easyui-textbox" name="receivingPartyName" id="receivingPartyName" style="width:150px;height:32px"/>
        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
        <a href="#" id="addbtn" class="easyui-linkbutton" plain="true" iconCls="icon-add" style="width:80px">添加</a>
    </div>
        <!--托运信息展示-->
        <div data-options="region:'center'" style="padding:5px;background:#eee;width:100%;height: auto;">
            <table id="consignmentdata"></table>
        </div>
</div>
<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="dlg" class="easyui-dialog" style="width: 500px; height: auto; padding: 10px 20px"
     data-options="closed:true,buttons:'#dlg-buttons'">
    <form id="fm" method="post">
        <table id="datagrid" style="width:auto;height:200px">
           <%-- <tr>
                <td >托运单号：</td>
                <td >

                    <input class="easyui-textbox" required="true" name="consignmentlistno" id="consignmentlistno1" value=""/>
                </td>

            </tr>--%>
            <tr>
                <td >重量：</td>
                <td>
                    <input type="hidden" readonly="readonly" required="true" name="consignmentlistid" id="consignmentlistid" value=""/>
                    <input class="easyui-textbox"  name="weight" id="weight" value=""/>
                </td>
                </td>
                <td >尺寸：</td>
                <td>
                    <input class="easyui-textbox"  name="size" id="size" value=""/>
                </td>
            </tr>
            <tr>
                <td >数量：</td>
                <td>
                    <input class="easyui-textbox"  name="number" id="number" value=""/>
                </td>
                <td >运单号：</td>
                <td>
                    <input id="waybillnumber" class="easyui-combobox" name="waybillnumber" required="true"
                           data-options="valueField: 'deliverynoteno',textField: 'deliverynoteno',url: '${pageContext.request.contextPath}/selectAllDeliverynoteByConsignment.action'">
                </td>
            </tr>
            <tr>
                <td >单位：</td>
                <td>
                    <input class="easyui-textbox" name="unit" id="unit"  value=""/>
                </td>
                <td >员工姓名：</td>
                <td>
                    <input id="employeeid" class="easyui-combobox" name="employeeid" required="true"
                           data-options="valueField: 'employeeid',textField: 'name',url: '${pageContext.request.contextPath}/selectAllEmployee.action'">
                </td>
                <%--<td >收货方：</td>
                <td>
                    <input id="receivingpartyid" class="easyui-combobox" name="receivingpartyid" required="true"
                           data-options="valueField:'receivingpartyid',textField:'receiptname',url:'${pageContext.request.contextPath}/selectAllReceivingparty.action'">
                </td>--%>
            </tr>
        </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="closeDialog()">关闭</a>
</div>
</body>
</html>
