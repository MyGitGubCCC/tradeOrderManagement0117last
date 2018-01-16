package com.xzit.service.impl;

import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeExample;
import com.xzit.mapper.EmployeeMapper;
import com.xzit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/5.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee selectByExample(EmployeeExample example) throws Exception {
        List<Employee> employees = employeeMapper.selectByExample(example);
        Employee employee = null;
        if(employees.size()>0){
           employee = employees.get(0);
        }

        return employee;
    }
}
