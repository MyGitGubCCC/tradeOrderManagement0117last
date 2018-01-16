<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>deliverynote</title>
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
    <%--省市区联动js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/linq.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/citiselect.js" ></script>

    <%--引入自定义的js--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/delivery-js.js"></script>
    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="送货单" >
    <div id="tb">
        送货单编号：<input class="easyui-textbox" name="deliverynoteno" id="deliverynoteno" style="width:150px;height:32px"/>
        是否取货：<select id="pickup" class="easyui-combobox" name="pickup" style="width:100px;">
        <option value="">全部</option>
        <option value="是">是</option>
        <option value="否">否</option>
        </select>
        员工姓名：<input class="easyui-textbox" name="employeename" id="employeename" style="width:150px;height:32px"/>
        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
        <a href="#" id="addbtn" class="easyui-linkbutton" plain="true" iconCls="icon-add" style="width:80px">添加</a>
    </div>
        <!--托运信息展示-->
        <div data-options="region:'center'" style="padding:5px;background:#eee;width:100%;height: auto;">
            <table id="deliverynotedata"></table>
        </div>
</div>
<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="dlg" class="easyui-dialog" style="width: 500px; height: auto; padding: 10px 20px"
     data-options="closed:true,buttons:'#dlg-buttons'">
    <form id="fm" method="post">
        <table id="datagrid" style="width:auto;height:200px">
            <tr>
                <td >货物编号：</td>
                <td>
                    <input type="hidden" readonly="readonly" name="commodityid" id="commodityid" value=""/>
                    <input class="easyui-textbox" readonly="readonly" name="commodityno" id="commodityno" value=""/>
                </td>
            </tr>
            <tr>
                <td >货物名称：</td>
                <td>
                    <input class="easyui-combobox" readonly="readonly" id="commodityname" name="commodityname" data-options="
		                 valueField: 'id',
		                 textField: 'orgName',
		                 data: [{id:'goodA',orgName:'货物1'},{id:'goodB',orgName:'货物2'},{id:'goodC',orgName:'货物3'}]" />
                </td>
            </tr>
            <tr>
                <td >单位：</td>
                <td>
                    <input class="easyui-textbox" readonly="readonly" name="specification" id="specification" value=""/>
                </td>
            </tr>

            <tr>
                <td >描述：</td>
                <td>
                    <input class="easyui-textbox" readonly="readonly" name="description" id="description" value=""/>
                </td>
            </tr>
            <tr>
                <td >数量：</td>
                <td>
                    <input class="easyui-textbox" readonly="readonly" name="ammount" id="ammount" value=""/>
                </td>
            </tr>
        </table>
    </form>

</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="closeDialog()">确定</a>
</div>
<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="adddlg" class="easyui-dialog" style="width: 500px; height: auto; padding: 10px 20px"
     data-options="closed:true,buttons:'#adddlg-buttons'">
    <form id="addfm" method="post">
        <table id="adddatagrid" style="width:auto;height:200px">
            <tr>
                <td >销售单号：</td>
                <td>
                    <input class="easyui-combobox" id="saleslistid" name="saleslistid" data-options="
				url: '${pageContext.request.contextPath}/selectAllSaleListByDeliverynote.action',
				method: 'get',
				valueField: 'saleslistid',
				textField: 'consigneeno',
				panelWidth: 350,
				panelHeight: 'auto',
				formatter: formatItem
			    ">
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="adddlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="addsaveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="addcloseDialog()">关闭</a>
</div>
<script type="text/javascript">
    function formatItem(row){
        var s = '<span style="font-weight:bold">' + row.consigneeno + '</span><br/>' +
            '<span style="color:#888">' + row.commodity.commodityname+','+ row.commodity.description+ '</span>';
        return s;
    }
</script>
</body>

</html>
