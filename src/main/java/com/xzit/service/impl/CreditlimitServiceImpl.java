package com.xzit.service.impl;

import com.xzit.entity.Creditlimit;
import com.xzit.mapper.CreditlimitMapper;
import com.xzit.service.CreditlimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Liu on 2018/1/13.
 */
@Service
public class CreditlimitServiceImpl implements CreditlimitService{

    @Autowired
    @Qualifier("creditlimitMapper")
    private CreditlimitMapper creditlimitMapper;

    public int insertCreditlimitInfo(Creditlimit record) throws Exception {
        return creditlimitMapper.insertCreditlimitInfo(record);
    }

    public int updateByPrimaryKey(Creditlimit record) throws Exception {
        return creditlimitMapper.updateByPrimaryKeySelective(record);
    }
}
