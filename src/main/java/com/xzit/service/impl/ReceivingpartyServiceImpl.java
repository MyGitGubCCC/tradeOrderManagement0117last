package com.xzit.service.impl;

import com.xzit.entity.Receivingparty;
import com.xzit.entity.ReceivingpartyExample;
import com.xzit.mapper.ReceivingpartyMapper;
import com.xzit.service.ReceivingpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/10.
 */
@Service
public class ReceivingpartyServiceImpl implements ReceivingpartyService{

    @Autowired
    @Qualifier("receivingpartyMapper")
    private ReceivingpartyMapper receivingpartyMapper;

    public int insertReceivingparty(Receivingparty record) throws Exception {
        return receivingpartyMapper.insertReceivingparty(record);
    }
    public List<Receivingparty> selectByExample(ReceivingpartyExample example) {
        return receivingpartyMapper.selectByExample(example);
    }
}
