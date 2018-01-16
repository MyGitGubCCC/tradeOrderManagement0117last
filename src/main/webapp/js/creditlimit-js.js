function editUser(index){
    $('#departmentsdg').datagrid('selectRow',index);// 关键在这里
    var row = $('#departmentsdg').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','签注客户信用额度');
        //$('#fm').form('load',row);
        $('#fm').form('load',{consigneeno:row.consigneeno,commodityname:row.commodity.commodityname != null ? row.commodity.commodityname : "",ammount:row.commodity.ammount,
            specification:row.commodity.specification,commodityprice:row.commodity.commodityprice,name:row.purchaseunit.name,place:row.purchaseunit.place,
            contactInformation:row.purchaseunit.contactInformation,paymentmethodid:row.paymentmethod.paymentmethodid,
            expectdeliverydate:row.expectdeliverydate,due:row.due,description:row.commodity.description,actualpayment:row.actualpayment,
            paymenttime:row.paymenttime,postalcode:row.receivingparty.postalcode,receiptname:row.receivingparty.receiptname,
            distributionmodeid:row.distributionmode.name,phonenumber:row.receivingparty.phonenumber,telephone:row.receivingparty.telephone,
            expressfee:row.expressfee,province:row.receivingparty.province,detailedaddress:row.receivingparty.detailedaddress,
            city:row.receivingparty.city,county:row.receivingparty.county,memberid:row.purchaseunit.member.name,saleslistid:row.saleslistid,
            purchaseunitid:row.purchaseunitid,notes:row.notes,checkOpinion:row.actualpaymentcapital,ordertime:row.ordertime});
    }
    /*$(':input').each(function(){//获取所有输入框遍历
     try{//放入try..catch中，放置不是easyui控件报错
     //$(this).textbox('disable')//禁用
     $(this).textbox('readonly')//只读
     }catch(e){}
     });
     $('#memberId').textbox('textbox').attr('readonly',false);*/

}

function saveUser(num) {
    var saleslistid  = $("input[name='saleslistid']").val();
    var ordertime  = $("input[name='ordertime']").val();
    var purchaseunitid  = $("input[name='purchaseunitid']").val();
    var employeeName  = $("input[name='employeeName']").val();
    var employeeid  = $("input[name='employeeid']").val();
    var customercapital  = $("input[name='customercapital']").val();
    var creditsituationdescription  = $("input[name='creditsituationdescription']").val();
    $.messager.confirm('提示消息', '确定提交?', function(r){
        if (r){
            $.ajax({
                url:"submitCreditlimit.action",
                type:"post",
                data:{
                    "saleslistid":saleslistid,
                    "purchaseunitid":purchaseunitid,
                    "auditaccountingname":employeeName,
                    "marketingdepartmentaccountid":employeeid,
                    "creditsituationdescription":creditsituationdescription,
                    "customercapital":customercapital,
                    "intercoursetime":ordertime,
                    "orderstatus2":num
                } ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#dlg').dialog('close');
                    var page = $("#departmentsdg").datagrid("options").pageNumber;
                    var rows = $("#departmentsdg").datagrid("options").pageSize ;
                    /*$('#fm').form('clear');*/
                    searchData(page,rows);
                }
            })
        }
    });
}

function closeDialog() {
    /*$('#fm').form('clear');*/
    $('#dlg').dialog('close');
}

$(document).ready(function() {
    //页面加载时初始化数据
    var page = $("#departmentsdg").datagrid("options").pageNumber;
    var rows = $("#departmentsdg").datagrid("options").pageSize ;
    searchData(page,rows);
});

$(function(){
    $("#findbtn").click(function(){
        var page = $("#departmentsdg").datagrid("options").pageNumber;
        var rows = $("#departmentsdg").datagrid("options").pageSize ;
        searchData(page,rows);
    });
    $("#delbtn").click(function(){
        //$('#cc').combobox('clear');
        $("#consigneenodel").textbox('setValue','');
        $("#orderstatus111").textbox('setValue','');
    });
    $("#addbtn").click(function(){
        $('#dlg').dialog('open').dialog('setTitle','添加销售清单');
        //省市区三级联动
        $.citySelect({ $province: $('#province'), $city: $('#city'), $County: $('#county') });
        //$('#fm').form('load', { 'province': '江苏省', 'city': '南京市', 'county': '玄武区' });
        $("#consigneeno").textbox('setValue',getNowFormatDate());
        /*$(':input').each(function(){//获取所有输入框遍历
         try{//放入try..catch中，放置不是easyui控件报错
         //$(this).textbox('disable')//禁用
         $(this).textbox('readonly',false);//只读
         }catch(e){}
         });
         $('#consigneeno').textbox('textbox').attr('readonly',true);
         $('#commodityprice2').textbox('textbox').attr('readonly',true);
         $('#specification').textbox('textbox').attr('readonly',true);
         $('#commodityprice').textbox('textbox').attr('readonly',true);
         $('#due').textbox('textbox').attr('readonly',true);*/
    });
    var j = 1;
    $("#receiveButton").click(function(){
        var receiveButtonid =$("#trStyle");
        var len = receiveButtonid.length;
        if(j==0){
            for (var i = 0; i<len;i++) {
                receiveButtonid[i].style.display="none";
            };
            j=1;
        }else{
            for (var i = 0; i<len;i++) {
                receiveButtonid[i].style.display="inline";
            };
            j=0;
        }
    });
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

function searchData(page,rows){
    var consigneeno = $("input[name='consigneeno']").val();
    var orderstatus2 = $("input[name='orderstatus2']").val();
    $.ajax({
        url:"selectAllCreditlimit.action",
        type:"post",
        data: {
            "page": page,
            "rows": rows,
            "consigneeno": consigneeno,
            "orderstatus2": "4"
        },
        dataType: 'json',
        success:function (data) {
            $("#departmentsdg").datagrid("loadData",data);  //动态取数据
            $("a[name='editUser']").linkbutton({text:'签注',plain:true,iconCls:'icon-edit'});
            /*$("a[name='deleteDepartment']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});*/
        }
    })
}

$(function () {
    $('#departmentsdg').datagrid('getPager').pagination({
        onBeforeRefresh:function(){
            //alert('before refresh');
        },
        onRefresh:function(pageNumber,pageSize){
            searchData(pageNumber,pageSize);
        },
        onChangePageSize:function(){
            //alert('pagesize changed');
        },
        onSelectPage:function(pageNumber,pageSize){
            searchData(pageNumber,pageSize);
        }
    });
});

/*val指当前单元格的值,row,当前行对象,index当前行的索引.*/
function formatOper(val,row,index){
    return '<a href="#" name="editUser" onclick="editUser('+index+')"class="easyui-linkbutton" ></a>';
    /*return '<a href="#" name="editUser" onclick="editUser('+index+')"class="easyui-linkbutton" ></a>&nbsp;' +
     '<a href="#"  name="deleteDepartment" onclick="deleteDepartment('+index+')"class="easyui-linkbutton" ></a>';*/
}

function deleteDepartment(index){
    $('#departmentsdg').datagrid('selectRow',index);// 关键在这里
    var row = $('#departmentsdg').datagrid('getSelected');
    if (row){
        $.messager.confirm('提示消息', '确定删除?', function(r){
            if (r){
                $.ajax({
                    url:"deleteEmployee.action",
                    type:"post",
                    data: {
                        "employeeid": row.employeeid
                    },
                    dataType: 'json',
                    success:function (data) {
                        $.messager.alert('提示消息',data,'info');
                        var page = $("#departmentsdg").datagrid("options").pageNumber;
                        var rows = $("#departmentsdg").datagrid("options").pageSize ;
                        searchData(page,rows);
                    }
                })
            }
        });

    }
}

$(function () {
    $("#commodityname").combobox({
        onChange: function (newValue,oldValue) {
            if(newValue=="goodA"){
                $("#commodityprice2").textbox('setValue','10万元/吨');
            }else if(newValue == "goodB"){
                $("#commodityprice2").textbox('setValue','20万元/吨');
            }else if(newValue == "goodC"){
                $("#commodityprice2").textbox('setValue','30万元/吨');
            }
            $("#commodityprice").textbox('setValue','0');
            $("#due").textbox('setValue',"0");
            /*if(newValue != null){
             $("#ammount").attr("readonly",true);
             }else{
             $("#ammount").attr("readonly",true);
             }*/
        }
    });

    $("#ammount").numberspinner({
        onChange: function (newValue,oldValue) {
            var num  = $("input[name='commodityname']").val();
            var sum = 0;
            var price = parseInt(newValue);
            if(num == "goodA"){
                sum = newValue * 10;
            }else if(num == "goodB"){
                sum = newValue * 20;
            }else if(num == "goodC"){
                sum = newValue * 30;
            }
            $("#due").textbox('setValue',String(sum)+"万元");
            $("#commodityprice").textbox('setValue',String(sum)+"万元");
        }
    });

});

function getNowFormatDate() {
    var date = new Date();
    /* var seperator1 = "-";
     var seperator2 = ":";*/
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    var hou = date.getHours();
    var minu = date.getMinutes();
    var sec = date.getSeconds();
    var mill = date.getMilliseconds();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    if(hou >= 0 && hou<= 9){
        hou = "0" + hou;
    }
    if(minu >= 0 && minu <= 9){
        minu = "0" + minu;
    }
    if(sec >= 0 && sec <= 9){
        sec = "0" + sec;
    }
    if(mill >= 0 && mill<= 9){
        mill = "000" + mill;
    }else if(mill >= 10 && mill<= 99){
        mill = "00" + mill;
    }else if(mill >= 100 && mill<= 999){
        mill = "0" + mill;
    }
    /*var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
     + " " + date.getHours() + seperator2 + date.getMinutes()
     + seperator2 + date.getSeconds();*/
    var currentdate = date.getFullYear() +  month +  strDate
        + hou +  minu + sec + mill;
    return currentdate;
}