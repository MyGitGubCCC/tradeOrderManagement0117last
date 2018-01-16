package com.xzit.service.impl;

import com.xzit.entity.Allocationlist;
import com.xzit.mapper.AllocationlistMapper;
import com.xzit.service.AllocationlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Liu on 2018/1/14.
 */
@Service
public class AllocationlistServiceImpl implements AllocationlistService {

    @Autowired
    @Qualifier("allocationlistMapper")
    private AllocationlistMapper allocationlistMapper;

    public int insertSelective(Allocationlist record) throws Exception {
        return allocationlistMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Allocationlist record) throws Exception {
        return allocationlistMapper.updateByPrimaryKeySelective(record);
    }
}
