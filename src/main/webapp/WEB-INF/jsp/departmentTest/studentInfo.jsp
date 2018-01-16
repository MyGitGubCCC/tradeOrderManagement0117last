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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/department-js.js" ></script>
    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="学生信息列表" >
    <div id="tb">
        班级：<%--<select class="easyui-combobox" name="classnamezc" style="width:150px;" ></select>--%>
        <input id="cc" style="width:100px;"
               url="showClass.action"
               name="classnamezc"
               valueField="classnamezc" textField="classnamezc">
        </input>
        学号：<input class="easyui-textbox" name="saccount" id="saccount" style="width:150px;height:32px"/>
        姓名(模糊查询)：<input class="easyui-textbox" name="realname" id="realname" style="width:150px;height:32px"/>
        学生是否选择实训基地(筛选条件)：
        <input type="radio" checked="checked" name="choiceName" id="choiceName1" value="不区分"/>不区分
        <input type="radio" name="choiceName" id="choiceName2" value="已选择"/>已选择
        <input type="radio" name="choiceName" id="choiceName3" value="已选择"/>未选择
        <a href="#" id="findbtn" class="easyui-linkbutton" plain="true" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
        <a href="#" id="delbtn" class="easyui-linkbutton" plain="true" iconCls="icon-cancel" style="width:80px">清除</a>
    </div>
    <div>
    <table id="studentsdg" class="easyui-datagrid" toolbar="#tb" style="width:100%;height: auto;"
           data-options="rownumbers:true,singleSelect:true,pagination:true,method:'get'">
        <thead>
        <tr>
            <th data-options="field:'saccount'" width="10%" align="center">学号</th>
            <th data-options="field:'realname'" width="10%" align="center">姓名</th>
            <th data-options="field:'sex'" width="10%" align="center">性别</th>
            <th data-options="field:'classnamezc'" width="10%" align="center">班级</th>
            <th data-options="field:'schooltel'" width="10%" align="center">学校电话</th>
            <th data-options="field:'enterprisetel'" width="10%" align="center">校外电话</th>
            <th data-options="field:'rows.enterprise.cnname',formatter:cnname" width="20%" align="center">实训单位</th>
            <th data-options="field:'tocompanyid'" width="5%" align="center">企业编号</th>
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
            <td >学&nbsp;&nbsp;号：</td>
            <td><input class="easyui-textbox" readonly="readonly" required="true" name="saccount" id="saccount1" value=""/></td>
            <td >姓&nbsp;&nbsp;名：</td>
            <td><input class="easyui-textbox" required="true" name="realname" id="realname1" value=""/></td>
            <td >性&nbsp;&nbsp;别：</td>
            <td><input class="easyui-textbox" name="sex" id="sex"  value=""/></td>
        </tr>
        <tr>
            <td >密&nbsp;&nbsp;码：</td><td><input class="easyui-textbox" required="true" name="spwd" id="spwd"  value=""/></td>
            <td >班级编号：</td><td><input class="easyui-textbox" required="true" name="classnameen" id="classnameen"  value=""/></td>
            <td >班级名称：</td><td><input class="easyui-textbox" required="true" name="classnamezc" id="classnamezc"  value=""/></td>
        </tr>
        <tr>
            <td >Q&nbsp;&nbsp;Q：</td><td><input class="easyui-textbox"  name="qq" id="qq"  value=""/></td>
            <td >校外电话：</td><td><input class="easyui-textbox"  name="enterprisetel" id="enterprisetel"  value=""/></td>
            <td >学校电话：</td><td><input class="easyui-textbox"  name="schooltel" id="schooltel"  value=""/></td>
        </tr>
        <tr>
            <td >企业编号：</td><td><input class="easyui-textbox"  name="tocompanyid" id="tocompanyid"  value=""/></td>
            <td >实训单位：</td><td colspan="3">
            <input style="width: 100%;" class="easyui-textbox"  name="cnname" id="cnname"  value=""/></td>
        </tr>
        <tr>
            <td >家庭住址：</td><td colspan="5">
            <input class="easyui-textbox" style="width: 100%;" name="homeadress" id="homeadress"  value=""/></td>
        </tr>

    </table>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>
<%--<script type="text/javascript">
    $(function(){
        var pager = $('#studentsdg').datagrid().datagrid('getPager');	// get the pager of datagrid
        pager.pagination({
            buttons:[{
                iconCls:'icon-search',
                handler:function(){
                    alert('search');
                }
            },{
                iconCls:'icon-add',
                handler:function(){
                    alert('add');
                }
            },{
                iconCls:'icon-edit',
                handler:function(){
                    alert('edit');
                }
            }]
        });
    })
</script>--%>
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
    $('#cc').combobox({
        formatter:function(row){
            return '<span class="item-text">'+row.classnamezc+'</span>';
        }
    });

    function cnname(value, rec) { return rec.enterprise != null ? rec.enterprise.cnname : ""; }

</script>

</body>
</html>
