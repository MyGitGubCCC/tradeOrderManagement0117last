$(function (){
    //查询事件
    $("#findbtn").click(function () {
        //获取1个输入框的内容
        var paymentmethodname = $("input[name='paymentmethodname']").val();
        $('#paymentmethoddata').datagrid("load", {"name":paymentmethodname});

    });
    //清除查询框内容
    $("#delbtn").click(function(){
        $("#name").textbox('setValue','');
        $("#employeeName").textbox('setValue','');
    });
    //添加点击事件，打开添加的dialog
    $("#addbtn").click(function(){
        $('#dlg').dialog('open').dialog('setTitle','添加托运单');
    });

    $('#paymentmethoddata').datagrid({
        url : 'selectPaymentMethod.action',
        queryParams:{"name":""},//第一次加载时选择所有基地和所有材料，第一个是entity中
        idField:'paymentmethodid',//实体的主键
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
                field : 'paymentmethodid',title : '支付编号',halign:'center', hidden:true//entity中的
            },
            {
                field:'name',title:'支付名称',halign:'center',width:300
            },
            {
                field:'description',title:'支付描述', halign:'center',width:300

            },
            {
                field:"action",
                title:"操作",
                halign:'center',
                align:'center',
                width:200,
                formatter:function(value,row,index){
                    var e = '<a href="#" onclick="edit(\''+ index + '\')">编辑</a> ';
                    var d = '<a href="#" data-options="iconCls:\'icon-remove\'" onclick="del(\''+ index +'\')">删除</a> ';
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
function saveUser() {
    $.messager.confirm('提示消息', '确定提交?', function(r){
        if (r){
            $.ajax({
                url:"insertOrUpdatePaymentMethod.action",
                type:"post",
                data:$('#fm').serialize() ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#dlg').dialog('close');
                    $('#fm').form('clear');
                    $('#paymentmethoddata').datagrid('load');
                }
            })
        }
    });
}
function del(index){

    $('#paymentmethoddata').datagrid('selectRow',index);// 关键在这里
    var row = $('#paymentmethoddata').datagrid('getSelected');

    if (index){
        $.messager.confirm('提示消息', '确定删除?', function(r){
            if (r){
                $.ajax({
                    url:"deletePaymentMethod.action",
                    type:"post",
                    data: {
                        "paymentmethodid": row.paymentmethodid
                    },
                    dataType: 'json',
                    success:function (data) {
                        $.messager.alert('提示消息',data,'info');
                        $('#paymentmethoddata').datagrid('deleteRow',index);
                    }
                })
            }
        });

    }
}
function edit(index){
    $('#paymentmethoddata').datagrid('selectRow',index);// 关键在这里
    var row = $('#paymentmethoddata').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','修改托运信息');
        $('#fm').form('load',row);
    }
}
