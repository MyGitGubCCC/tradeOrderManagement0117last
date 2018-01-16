$(function (){
    //查询事件
    $("#findbtn").click(function () {
        //获取两个输入框的内容
        var consignmentListNo = $("input[name='consignmentListNo']").val();
        var receivingPartyName = $("input[name='receivingPartyName']").val();
        var employeeName = $("input[name='employeeName']").val();
        $('#consignmentdata').datagrid("load", {"consignmentlistno":consignmentListNo, "receivingpartyname":receivingPartyName,"employeename":employeeName});
    });
    //清除查询框内容
    $("#delbtn").click(function(){
        $("#consignmentListNo").textbox('setValue','');
        $("#receivingPartyName").textbox('setValue','');
        $("#employeeName").textbox('setValue','');
    });
    //添加点击事件，打开添加的dialog
    $("#addbtn").click(function(){
        $('#dlg').dialog('open').dialog('setTitle','添加托运单');
    });

    $('#consignmentdata').datagrid({
        url : 'selectConsignment.action',
        queryParams:{"consignmentlistno":"",receivingpartyname:"",employeename:""},//第一次加载时选择所有基地和所有材料
        idField:'consignmentlistid',
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
                field : 'consignmentlistid',title : '编号',halign:'center', hidden:true
            },
            {
                field:'consignmentlistno',title:'托运单号',halign:'center',width:200
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
                field:'weight', title:'重量',halign:'center',width:80
            },
            {
                field : 'size',title : '尺寸',halign:'center', width : 80,
            },
            {
                field:'number',title:'数量', halign:'center', width:80
            },
            {
                field : 'waybillnumber',title : '运单号',halign:'center',width : 200,
            },
            {
                field : 'unit', title : '单位',halign:'center',width : 80,
            },
            {
                field : 'receivingpartyid',title : '收货方', halign:'center',width : 160,
                formatter: function(value,row,index){
                    if (row.receivingparty){
                        return row.receivingparty.receiptname;
                    } else {
                        return value;
                    }
                }
            },
            {
                field:"action",title:"操作", halign:'center',align:'center',width:160,
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
                url: "insertOrUpdateConsignmentList.action",
                type: "post",
                data: $('#fm').serialize() ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#dlg').dialog('close');
                    $('#fm').form('clear');
                    $('#consignmentdata').datagrid('load');
                }
            })
        }
    });
}
function del(index){

    $('#consignmentdata').datagrid('selectRow',index);// 关键在这里
    var row = $('#consignmentdata').datagrid('getSelected');

    if (index){
        $.messager.confirm('提示消息', '确定删除?', function(r){
            if (r){
                $.ajax({
                    url:"deleteConsignmentList.action",
                    type:"post",
                    data: {
                        "consignmentlistid": row.consignmentlistid
                    },
                    dataType: 'json',
                    success:function (data) {
                        $.messager.alert('提示消息',data,'info');
                        $('#consignmentdata').datagrid('deleteRow',index);
                    }
                })
            }
        });

    }
}
function edit(index){
    $('#consignmentdata').datagrid('selectRow',index);// 关键在这里
    var row = $('#consignmentdata').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','修改托运信息');
        $('#fm').form('load',row);
    }
}
