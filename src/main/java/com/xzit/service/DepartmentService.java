package com.xzit.service;

import com.xzit.entity.Department;
import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Liu on 2018/1/4.
 */
public interface DepartmentService {
    List<Department> selectDepartment(Department department,Integer page,Integer rows) throws  Exception;
    int totalDepartment(Department department) throws Exception;
    int deleteDepartment(Integer departmentid) throws Exception;
    int updateDepartment(Department department) throws Exception;
    int addDepartment(Department department) throws Exception;
    int totalDepartment2(Department department) throws Exception;
    List<Department> allDepartment() throws Exception;


}
