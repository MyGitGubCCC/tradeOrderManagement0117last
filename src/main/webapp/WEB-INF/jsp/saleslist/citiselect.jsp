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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/linq.js" ></script>



    <script type="text/javascript" src="${pageContext.request.contextPath}/js/citiselect.js" ></script>

    <!--引入EasyUI 图标文件-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.3/themes/icon.css" />
</head>
<body class="easyui-layout">
<div region="center" fit="true" title="员工信息列表" >
    <form id="ff" method="post">
         <table>
                     <tbody>
                     <tr>
                             <td>
                                 <label for="province">省：</label>
                             </td>
                             <td>
                                 <input id="province" name="province" type="text" class="easyui-combobox" />
                             </td>
                         </tr>
                     <tr>
                             <td>
                                 <label for="city">市：</label>
                             </td>
                             <td>
                                 <input id="city" name="city" type="text" class="easyui-combobox" />
                             </td>
                         </tr>
                     <tr>
                             <td>
                                 <label for="county">区：</label>
                             </td>
                             <td>
                                 <input id="county" name="county" type="text" class="easyui-combobox" />
                             </td>
                         </tr>
                 </tbody>
                 </table>
         </form>
</div>

<script type="text/javascript">

    $(function () {
                 //省市区三级联动
                 $.citySelect({ $province: $('#province'), $city: $('#city'), $County: $('#county') });
                 $('#ff').form('load', { 'province': '广东省', 'city': '深圳市', 'county': '罗湖区' });
         });

    $.extend($.fn.combobox.methods, {
             setIndex: function (jq, index) {
                 if (!index)
                         index = 0;
                 var data = $(jq).combobox('options').data;
                 var vf = $(jq).combobox('options').valueField;
                 $(jq).combobox('setValue', eval('data[index].' + vf));
             },

         getIndex: function (jq) {
                 var index = 0;
                 var data = $(jq).combobox('options').data;
                 var vf = $(jq).combobox('options').valueField;
                 var value = $(jq).combobox('getValue');
                 if (data != null && data.length != null) {
                         for (var i = 0; i < data.length; i++) {
                                 if (value == eval('data[i].' + vf))
                                         index = i;
                             }
                     }
                 return index;
             }
     });

</script>

</body>
</html>
