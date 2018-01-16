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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/employee-js.js" ></script>
    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="员工信息列表" >
    <div id="tb">
        部门名称：
        <input id="cc" style="width:130px;"
               url="allDepartment.action"
               name="departmentid"
               valueField="departmentid" textField="departmentname">
        </input>
        员工编号：<input class="easyui-textbox" name="employeeNo" id="employeeNo" style="width:150px;height:32px"/>
        员工姓名：<input class="easyui-textbox" name="name" id="name" style="width:150px;height:32px"/>
        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
        <a href="#" id="addbtn" class="easyui-linkbutton" plain="true" iconCls="icon-add" style="width:80px">添加</a>
    </div>
    <div>
        <table id="departmentsdg" class="easyui-datagrid" toolbar="#tb" style="width:100%;height: auto;"
               data-options="rownumbers:true,singleSelect:true,pagination:true,method:'get'">
            <thead>
            <tr>
                <th data-options="field:'employeeNo'" width="25%" align="center">员工编号</th>
                <th data-options="field:'name'" width="20%" align="center">员工姓名</th>
                <th data-options="field:'departmentName'" width="30%" align="center">部门名称</th>
                <th data-options="field:'privilege'" width="5%" align="center">权限</th>
                <th data-options="field:'_operate',formatter:formatOper" width="10%" align="center">操作</th>
            </tr>
            </thead>
        </table>
    </div>
</div>

<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
<div id="dlg" class="easyui-dialog" style="width: 900px; height: auto; padding: 10px 20px"
     data-options="closed:true,buttons:'#dlg-buttons'">
    <form id="fm" method="post">
        <table id="datagrid" style="width:auto;height:500px">
            <tr>
                <td >员工编号： <input type="hidden" readonly="readonly" required="true" name="employeeid" id="employeeid" value=""/></td>
                <td><input class="easyui-textbox" required="true" name="employeeNo" id="employeeNo1" value=""/></td>
                <td >员工姓名：</td>
                <td><input class="easyui-textbox" required="true" name="name" id="name1" value=""/></td>
                <td >部门名称：</td>
                <td>
                    <input id="ccc" style="width:130px;"
                           url="allDepartment.action"
                           name="departmentId"
                           valueField="departmentid" textField="departmentname">
                    </input>
                </td>
            </tr>
            <tr>
                <td >密码：</td>
                <td><input class="easyui-textbox" required="true" name="password" id="password" value=""/></td>
                <td >权限：</td>
                <td><input class="easyui-textbox" required="true" name="privilege" id="privilege" value=""/></td>
                <td >电话：</td>
                <td><input class="easyui-textbox" name="mobileNumber" id="mobileNumber"  value=""/></td>
            </tr>
        </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser()">保存</a>
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

</script>

</body>
</html>
