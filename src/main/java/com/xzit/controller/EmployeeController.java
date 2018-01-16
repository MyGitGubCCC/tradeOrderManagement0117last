package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Department;
import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeAndDEpartment;
import com.xzit.entity.EmployeeExample;
import com.xzit.service.DepartmentService;
import com.xzit.service.EmployeeService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Liu on 2018/1/5.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/employeelist.action")
    public ModelAndView saleslist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employee/employeeList");
        return mv;
    }

    @RequestMapping(value = "/allDepartment.action")
    @ResponseBody
    public List<Department> allDepartment() throws Exception{
        return departmentService.allDepartment();
    }

    @RequestMapping(value = "/selectemployeelist.action")
    @ResponseBody
    public DataGrid<EmployeeAndDEpartment> selectemployeelist(EmployeeAndDEpartment de, Integer page, Integer rows) throws Exception{
        EmployeeAndDEpartment d = new EmployeeAndDEpartment();
        d.setDepartmentId(de.getDepartmentId());
        d.setEmployeeNo(de.getEmployeeNo());
        d.setName(de.getName());
        List<EmployeeAndDEpartment> employeeAndDEpartments = employeeService.selectAllEmployee(d,(page-1)*rows,rows);
        Integer total = employeeService.totalAllEmployee(d);
        DataGrid<EmployeeAndDEpartment> dataGrid = new DataGrid<EmployeeAndDEpartment>();
        dataGrid.setRows(employeeAndDEpartments);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/updateEmployee.action")
    @ResponseBody
    public String updateEmployee(EmployeeAndDEpartment emp){
        String str = "";
        EmployeeAndDEpartment empl = new EmployeeAndDEpartment();
        empl.setName(emp.getName());
        empl.setEmployeeNo(emp.getEmployeeNo());
        empl.setDepartmentId(emp.getDepartmentId());
        empl.setPassword(emp.getPassword());
        empl.setPrivilege(emp.getPrivilege());
        empl.setMobileNumber(emp.getMobileNumber());
        empl.setEmployeeid(emp.getEmployeeid());
        try {
            if(emp.getEmployeeid() != null  ){
                int upNum = employeeService.updateEmployee(empl);
                if (upNum==0){
                    str = "更新失败！";
                }else{
                    str = "更新成功！";
                }
            }else{
                if(employeeService.totalAllEmployee2(empl)>0){
                    str = "员工编号已经存在！";
                }else{
                    int upNum = employeeService.addEmployee(empl);
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

    @RequestMapping(value = "/deleteEmployee.action")
    @ResponseBody
    public String deleteEmployee(EmployeeAndDEpartment emp){
        String str = "";
        int employeeid = emp.getEmployeeid();
        try {
            int delNum = employeeService.deleteEmployee(employeeid);
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

    //曹成成
    @RequestMapping(value = "selectAllEmployee.action")
    @ResponseBody
    public List<Employee> selectAllEmployee() throws Exception{
        EmployeeExample employeeExample = new EmployeeExample();
        List<Employee> employees = employeeService.selectByExample(employeeExample);
        return employees;
    }
}
