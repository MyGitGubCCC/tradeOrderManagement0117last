<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>

<head>
    <title>会员信息</title>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/member-js.js" ></script>
    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>

<body class="easyui-layout">
<div region="center" fit="true" title="学生信息列表" >
    <div id="tb">
        会员名称：<input class="easyui-textbox" name="membername" id="membername" style="width:150px;height:32px"/>
        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
        <a href="#" id="addbtn" class="easyui-linkbutton" plain="true" iconCls="icon-add" style="width:80px">添加</a>
    </div>
    <!--托运信息展示-->
    <div data-options="region:'center'" style="padding:5px;background:#eee;width:100%;height: auto;">
        <table id="memberdata"></table>
    </div>
</div>

<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="dlg" class="easyui-dialog" style="width: 900px; height: auto; padding: 10px 20px"
     data-options="closed:true,buttons:'#dlg-buttons'">
    <form id="fm" method="post">
        <table id="datagrid" style="width:auto;height:500px">
            <tr>

                <td >支付名称：</td>
                <td><%--//jsp中的name要与entity中的名称一一对应--%>
                    <%--hidden这一行，name应该是该表的主键--%>
                    <input type="hidden" readonly="readonly" required="true" name="memberid" id="memberid" value=""/>
                    <input class="easyui-textbox" required="true" name="name" id="membername" value=""/>
                </td>
            </tr>
            <tr>
                <td >支付描述：</td>
                <td colspan="3">
                    <input class="easyui-textbox" style="width: 100%;" name="description" id="description"  value=""/>
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="closeDialog()">关闭</a>
</div>
<script type="text/javascript">
    $(function () {
        var aCat=document.getElementsByName('choiceName');
        for(var i=0;i<aCat.length;i++)
        {
            aCat[i].onchange=function()
            {
                //alert(this.value);
            }
        }
    });

</script>

</body>
</html>
