function editUser(index){
    $('#departmentsdg').datagrid('selectRow',index);// 关键在这里
    var row = $('#departmentsdg').datagrid('getSelected');
    if (row){
        $('#dlg').dialog('open').dialog('setTitle','修改员工信息');
        $('#fm').form('load',row);
    }
}

function saveUser() {
    $.messager.confirm('提示消息', '确定提交?', function(r){
        if (r){
            $.ajax({
                url:"updateEmployee.action",
                type:"post",
                data:$('#fm').serialize() ,//表单序列化
                dataType: 'json',
                success:function (data) {
                    $.messager.alert('提示消息',data,'info');
                    $('#dlg').dialog('close');
                    var page = $("#departmentsdg").datagrid("options").pageNumber;
                    var rows = $("#departmentsdg").datagrid("options").pageSize ;
                    $('#fm').form('clear');
                    searchData(page,rows);
                }
            })
        }
    });
}

function closeDialog() {
    $('#fm').form('clear');
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
        $('#cc').combobox('clear');
        $("#employeeNo").textbox('setValue','');
        $("#name").textbox('setValue','');
    });
    $("#addbtn").click(function(){
        $('#dlg').dialog('open').dialog('setTitle','添加员工信息');
    });
});

function searchData(page,rows){
    var departmentId = $("input[name='departmentid']").val();
    var employeeNo = $("input[name='employeeNo']").val();
    var name = $("input[name='name']").val();
    $.ajax({
        url:"selectemployeelist.action",
        type:"post",
        data: {
            "page": page,
            "rows": rows,
            "departmentId": departmentId,
            "employeeNo": employeeNo,
            "name": name
        },
        dataType: 'json',
        success:function (data) {
            $("#departmentsdg").datagrid("loadData",data);  //动态取数据
            $("a[name='editUser']").linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
            $("a[name='deleteDepartment']").linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});
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
    return '<a href="#" name="editUser" onclick="editUser('+index+')"class="easyui-linkbutton" ></a>&nbsp;' +
        '<a href="#"  name="deleteDepartment" onclick="deleteDepartment('+index+')"class="easyui-linkbutton" ></a>';
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