package com.xzit.service.impl;

import com.xzit.entity.Applytransferform;
import com.xzit.mapper.ApplytransferformMapper;
import com.xzit.service.ApplytransferformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Liu on 2018/1/14.
 */
@Service
public class ApplytransferformServiceImpl implements ApplytransferformService{

    @Autowired
    @Qualifier("applytransferformMapper")
    private ApplytransferformMapper applytransferformMapper;

    public int insertSelective2(Applytransferform record) throws Exception {
        return applytransferformMapper.insertSelective2(record);
    }

    public int updateByPrimaryKeySelective(Applytransferform record) throws Exception {
        return applytransferformMapper.updateByPrimaryKeySelective(record);
    }
}
