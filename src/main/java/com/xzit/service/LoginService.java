package com.xzit.service;

import com.xzit.entity.Employee;
import com.xzit.entity.EmployeeExample;

import java.util.List;

/**
 * Created by Liu on 2018/1/5.
 */
public interface LoginService {
    Employee selectByExample(EmployeeExample example) throws Exception;
}
