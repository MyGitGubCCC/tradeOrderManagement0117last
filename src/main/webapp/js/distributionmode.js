$(function (){
    //查询事件
    $("#findbtn").click(function () {
        //获取两个输入框的内容
        var distributionmodename = $("input[name='distributionmodename']").val();
        $('#distributionmodedata').datagrid("load", {"name":distributionmodename});
    });
    //清除查询框内容
    $("#delbtn").click(function(){
        $("#distributionmodename").textbox('setValue','');
    });
    //添加点击事件，打开添加的dialog
    $("#addbtn").click(function(){
        $('#dlg').dialog('open').dialog('setTitle','添加托运单');
    });

    $('#distributionmodedata').datagrid({
        url : 'selectDistributionmode.action',
        queryParams:{"name":""},//第一次加载时选择所有基地和所有材料,第一个引号里面是实体中的字段
        idField:'distributionmodeid',//实体中的主键
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
                field : 'distributionmodeid',title : '编号',halign:'center', hidden:true
            },
            {
                field:'name',title:'配送方式名称',halign:'center',width:80
            },
            {
                field:'description',title:'描述', halign:'center',width:80

            },
            {
                field:"action",
                title:"操作",
                halign:'center',
                align:'center',
                width:160,
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
                url:"insertDistributionmode.action",
                type:"post",
                data:$('#fm').serialize() ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#dlg').dialog('close');
                    $('#fm').form('clear');
                    $('#distributionmodedata').datagrid('load');
                }
            })
        }
    });
}
function del(index){

    $('#distributionmodedata').datagrid('selectRow',index);// 关键在这里
    var row = $('#distributionmodedata').datagrid('getSelected');

    if (index){
        $.messager.confirm('提示消息', '确定删除?', function(r){
            if (r){
                $.ajax({
                    url:"deleteDistributionmode.action",
                    type:"post",
                    data: {
                        "distributionmodeid": row.distributionmodeid
                    },
                    dataType: 'json',
                    success:function (data) {
                        $.messager.alert('提示消息',data,'info');
                        $('#distributionmodedata').datagrid('deleteRow',index);
                    }
                })
            }
        });

    }
}
function edit(index){
    $('#distributionmodedata').datagrid('selectRow',index);// 关键在这里
    var row = $('#distributionmodedata').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','修改配送方式');
        $('#fm').form('load',row);
    }
}
