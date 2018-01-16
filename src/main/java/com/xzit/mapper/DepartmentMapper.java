package com.xzit.mapper;

import com.xzit.entity.Department;
import com.xzit.entity.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer departmentid);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);


    List<Department> selectDepartment(@Param("de") Department department,@Param("page") Integer page,@Param("rows") Integer rows);
    int totalDepartment(@Param("de") Department department);
    int totalDepartment2(@Param("de") Department department);
    int deleteDepartment(@Param("departmentid") Integer departmentid);
    int updateDepartment(@Param("de") Department department);
    int addDepartment(@Param("de") Department department);
    List<Department> allDepartment();
}