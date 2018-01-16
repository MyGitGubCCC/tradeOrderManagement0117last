package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Department;
import com.xzit.service.DepartmentService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Liu on 2018/1/4.
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/departmentlist.action")
    public ModelAndView departmentlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("department/department");
        return mv;
    }

    @RequestMapping(value = "/selectDepartment.action")
    @ResponseBody
    public DataGrid<Department> selectDepartment(Department de,Integer page,Integer rows) throws Exception{
        Department department = new Department();
        department.setDepartmentno(de.getDepartmentno());
        department.setDepartmentname(de.getDepartmentname());
        List<Department> departments = departmentService.selectDepartment(department,(page-1)*rows,rows);
        Integer total = departmentService.totalDepartment(department);
        DataGrid<Department> dataGrid = new DataGrid<Department>();
        dataGrid.setRows(departments);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/deleteDepartment.action")
    @ResponseBody
    public String deleteDepartment(Department department){
        String str = "";
        int departmentid = department.getDepartmentid();
        try {
            int delNum = departmentService.deleteDepartment(departmentid);
            if (delNum==0){
                str = "删除失败！";
            }else{
                str = "删除成功！";
            }
        } catch (Exception e) {
            e.printStackTrace();
            str=e.getMessage();
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    @RequestMapping(value = "/updateDepartment.action")
    @ResponseBody
    public String updateDepartment(Department de){
        String str = "";
        Department department = new Department();
        department.setDepartmentid(de.getDepartmentid());
        department.setDepartmentno(de.getDepartmentno());
        department.setDepartmentname(de.getDepartmentname());
        department.setDescription(de.getDescription());
        try {
            if(de.getDepartmentid()!= null  ){
                int upNum = departmentService.updateDepartment(department);
                if (upNum==0){
                    str = "更新失败！";
                }else{
                    str = "更新成功！";
                }
            }else{
                if(departmentService.totalDepartment2(department)>0){
                    str = "部门编号已经存在！";
                }else{
                    int upNum = departmentService.addDepartment(department);
                    if (upNum==0){
                        str = "添加失败！";
                    }else{
                        str = "添加成功！";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            str="数据操作异常吗，请联系我们！";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str ;
    }
}
