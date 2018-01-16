package com.xzit.service;

import com.xzit.entity.Receivingparty;
import com.xzit.entity.ReceivingpartyExample;

import java.util.List;

/**
 * Created by Liu on 2018/1/10.
 */
public interface ReceivingpartyService {

    int insertReceivingparty(Receivingparty record) throws Exception;
    //曹成成
    List<Receivingparty> selectByExample(ReceivingpartyExample example);
}
