package com.xzit.service;

import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeAndDEpartment;
import com.xzit.entity.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Liu on 2018/1/5.
 */
public interface EmployeeService {
    List<EmployeeAndDEpartment> selectAllEmployee(EmployeeAndDEpartment employeeAndDEpartment,Integer page, Integer rows) throws Exception;
    int totalAllEmployee(EmployeeAndDEpartment employeeAndDEpartment) throws Exception;
    int totalAllEmployee2(EmployeeAndDEpartment employeeAndDEpartment);
    int updateEmployee(EmployeeAndDEpartment employeeAndDEpartment) throws Exception;
    int deleteEmployee(Integer employeeid) throws Exception;
    int addEmployee(EmployeeAndDEpartment employeeAndDEpartment) throws Exception;
    int modifyPasswordInfo(Employee employee) throws Exception;

    //曹成成
    List<Employee> selectByExample(EmployeeExample example);
}
