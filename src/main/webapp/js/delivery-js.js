$(function (){
    //查询事件
    $("#findbtn").click(function () {
        //获取两个输入框的内容
        var deliverynoteno = $("input[name='deliverynoteno']").val();
        var pickup = $("#pickup ").val();
        var employeename = $("input[name='employeename']").val();
        $('#deliverynotedata').datagrid("load", {"deliverynoteno":deliverynoteno, "pickup":pickup,"employeename":employeename});
    });
    //清除查询框内容
    $("#delbtn").click(function(){
        $("#deliverynoteno").textbox('setValue','');
        $("#pickup").empty();
        $("#employeename").textbox('setValue','');
    });

    //添加点击事件，打开添加的dialog
    $("#addbtn").click(function(){
        $('#adddlg').dialog('open').dialog('setTitle','选择要取货单');
    });

    $('#deliverynotedata').datagrid({
        url : 'selectAllDeliveryNoteVo.action',
        queryParams:{"deliverynoteno":"","pickup":"",employeename:""},//第一次加载时选择所有基地和所有材料
        idField:'deliverynoteid',
        iconCls : 'icon-man',
        striped : true,
        rownumbers : true,
        singleSelect : true,
        fitColumns : false,
        pagination: true,
        pageSize:20,
        pageList:[10,20,30,40],
        loadMsg:'正在加载资源文档信息...',
        emptyMsg:'没有检索到资源文档信息',
        //下面的field要与实体类中的属性名对应，要显示那个给那个
        columns : [[
            {
                field : 'deliverynoteid',title : '编号',halign:'center', hidden:true
            },
            {
                field:'deliverynoteno',title:'送货单号',halign:'center',width:200
            },
            {
                field:'employeeid',title:'员工姓名', halign:'center',width:80,
                formatter: function(value,row,index){
                    if (row.employee){
                        return row.employee.name;
                    } else {
                        return value;
                    }
                }
            },
            {
                field:'saleslistid', title:'销售单编号',halign:'center',width:200,
                formatter:function (value,row,index) {
                    if (row.saleslist){
                        return row.saleslist.consigneeno;
                    } else {
                        return value;
                    }
                }
            },
            {
                field : 'pickup',title : '是否取货',halign:'center', width : 80,
            },
            {
                field:"action",title:"操作", halign:'center',align:'center',width:160,
                formatter:function(value,row,index){
                    var e = '<a href="#" onclick="edit(\''+ index + '\')">取货详情</a> ';
                    var d = '<a href="#" onclick="saveUser(\''+ index +'\')">取货</a> ';
                    return e+d;
                }
            }
        ]]
    });

})
function closeDialog() {
    $('#fm').form('clear');
    $('#dlg').dialog('close');
}
function addcloseDialog() {
    $('#adddlg').dialog('close');
}

function addsaveUser() {
    $.messager.confirm('提示消息', '确定接收取货?', function(r){
        if (r){
            $.ajax({
                url:"insertOrUpdateDeliveryNote.action",
                type:"post",
                data:$('#addfm').serialize() ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#adddlg').dialog('close');
                    $('#addfm').form('clear');
                    $('#deliverynotedata').datagrid('load');
                }
            })
        }
    });
}

function saveUser(index) {
    $('#deliverynotedata').datagrid('selectRow',index);// 关键在这里
    var row = $('#deliverynotedata').datagrid('getSelected');
    $.messager.confirm('提示消息', '确定取货?', function(r){
        if (r){
            $.ajax({
                url:"pickup.action",
                type:"post",
                data:{
                    "deliverynoteid": row.deliverynoteid,
                    "saleslistid": row.saleslistid
                },
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#deliverynotedata').datagrid('load');
                }
            })
        }
    });
}

function edit(index){
    $('#deliverynotedata').datagrid('selectRow',index);// 关键在这里
    var row = $('#deliverynotedata').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','货物订单详情');
        $('#fm').form('load',row.saleslist.commodity);
    }
}
