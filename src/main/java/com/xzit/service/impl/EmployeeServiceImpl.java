package com.xzit.service.impl;

import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeAndDEpartment;
import com.xzit.entity.EmployeeExample;
import com.xzit.mapper.EmployeeMapper;
import com.xzit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/5.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    @Qualifier("employeeMapper")
    private EmployeeMapper employeeMapper;
    public List<EmployeeAndDEpartment> selectAllEmployee(EmployeeAndDEpartment employeeAndDEpartment, Integer page, Integer rows) {
        return employeeMapper.selectAllEmployee(employeeAndDEpartment,  page,  rows);
    }

    public int totalAllEmployee(EmployeeAndDEpartment employeeAndDEpartment) {
        return employeeMapper.totalAllEmployee(employeeAndDEpartment);
    }

    public int totalAllEmployee2(EmployeeAndDEpartment employeeAndDEpartment) {
        return employeeMapper.totalAllEmployee2(employeeAndDEpartment);
    }

    public int updateEmployee(EmployeeAndDEpartment employeeAndDEpartment) throws Exception {
        return employeeMapper.updateEmployee(employeeAndDEpartment);
    }

    public int deleteEmployee(Integer employeeid) throws Exception {
        return employeeMapper.deleteEmployee(employeeid);
    }

    public int addEmployee(EmployeeAndDEpartment employeeAndDEpartment) throws Exception {
        return employeeMapper.addEmployee(employeeAndDEpartment);
    }

    public int modifyPasswordInfo(Employee employee) throws Exception {
        return employeeMapper.modifyPasswordInfo(employee);
    }

    public List<Employee> selectByExample(EmployeeExample example) {
        return employeeMapper.selectByExample(example);
    }
}
