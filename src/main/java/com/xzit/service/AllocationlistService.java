package com.xzit.service;

import com.xzit.entity.Allocationlist;

/**
 * Created by Liu on 2018/1/14.
 */
public interface AllocationlistService {

    int insertSelective(Allocationlist record) throws Exception;

    int updateByPrimaryKeySelective(Allocationlist record) throws Exception;
}
