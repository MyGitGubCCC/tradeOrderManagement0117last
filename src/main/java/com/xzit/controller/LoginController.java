package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeExample;
import com.xzit.service.EmployeeService;
import com.xzit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liu on 2018/1/5.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/login.action")
    public ModelAndView login()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        return mv;
    }

    @RequestMapping(value = "/tradeOrderMain.action")
    public ModelAndView tradeOrderMain(Employee employee, HttpSession httpSession)throws Exception{

        httpSession.setAttribute("employee",employee);
        httpSession.setAttribute("employeeid",employee.getEmployeeid());
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",employee.getName());
        mv.addObject("employeeno",employee.getEmployeeno());
        mv.setViewName("main/main");
        return mv;
    }
    @RequestMapping(value = "/tradeOrderMainInfo.action")
    public ModelAndView tradeOrderMainInfo()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main/mainInfo");
        return mv;
    }



    @RequestMapping(value = "/loginJudge.action")
    @ResponseBody
    public Employee loginJudge(Employee employee)throws Exception{
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmployeenoEqualTo(employee.getEmployeeno());
        criteria.andPasswordEqualTo(employee.getPassword());
        Employee em = new Employee();
        if(loginService.selectByExample(employeeExample) != null){
            em =  loginService.selectByExample(employeeExample);
        }else{
            em.setName("error");
        }
        return em;
    }

    @RequestMapping(value = "/modifyPassword.action")
    public ModelAndView modifyPassword()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main/modifyPassword");
        return mv;
    }

    @RequestMapping(value = "/modifyPasswordInfo.action")
    @ResponseBody
    public Map modifyPasswordInfo(Employee employee)throws Exception{
        String str = "";
        int num = employeeService.modifyPasswordInfo(employee);
        if(num>0){
            str = "true";
        }else {
            str = "false";
        }
       /* ObjectMapper mapper = new ObjectMapper();
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
       Map<String,String> map = new HashMap<String, String>();
       map.put("str",str);
        return map;
    }

}
