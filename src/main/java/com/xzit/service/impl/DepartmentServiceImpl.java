package com.xzit.service.impl;

import com.xzit.entity.Department;
import com.xzit.mapper.DepartmentMapper;
import com.xzit.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/4.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    @Qualifier("departmentMapper")
    private DepartmentMapper departmentMapper;
    public List<Department> selectDepartment(Department department,Integer page,Integer rows) throws Exception {
        return departmentMapper.selectDepartment(department, page, rows);
    }

    public int totalDepartment(Department department) {
        return departmentMapper.totalDepartment(department);
    }

    public int deleteDepartment(Integer departmentid) throws Exception {
        return departmentMapper.deleteDepartment(departmentid);
    }

    public int updateDepartment(Department department) throws Exception {
        return departmentMapper.updateDepartment(department);
    }

    public int addDepartment(Department department) throws Exception {
        return departmentMapper.addDepartment(department);
    }

    public int totalDepartment2(Department department) throws Exception {
        return departmentMapper.totalDepartment2(department);
    }

    public List<Department> allDepartment() throws Exception {
        return departmentMapper.allDepartment();
    }


}
