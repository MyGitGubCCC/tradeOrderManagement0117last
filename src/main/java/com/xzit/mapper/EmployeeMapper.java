package com.xzit.mapper;

import com.xzit.entity.Department;
import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeAndDEpartment;
import com.xzit.entity.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer employeeid);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<EmployeeAndDEpartment> selectAllEmployee(@Param("edp") EmployeeAndDEpartment employeeAndDEpartment, @Param("page") Integer page, @Param("rows") Integer rows);
    int totalAllEmployee(@Param("edp") EmployeeAndDEpartment employeeAndDEpartment);
    int totalAllEmployee2(@Param("edp") EmployeeAndDEpartment employeeAndDEpartment);

    int updateEmployee(@Param("edp") EmployeeAndDEpartment employeeAndDEpartment);
    int deleteEmployee(@Param("employeeid") Integer employeeid);

    int addEmployee(@Param("edp") EmployeeAndDEpartment employeeAndDEpartment);

    int modifyPasswordInfo(@Param("em") Employee employee);

}