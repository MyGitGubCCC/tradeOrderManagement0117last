package com.xzit.service.impl;

import com.xzit.entity.Purchaseunit;
import com.xzit.mapper.PurchaseunitMapper;
import com.xzit.service.PurchaseunitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Liu on 2018/1/9.
 */
@Service
public class PurchaseunitServiceImpl implements PurchaseunitService {

    @Autowired
    @Qualifier("purchaseunitMapper")
    private PurchaseunitMapper purchaseunitMapper;

    public int insertPurchaseunit(Purchaseunit record) throws Exception {
        return purchaseunitMapper.insertPurchaseunit(record);
    }

    public int updateByPrimaryKeySelective(Purchaseunit record) throws Exception {
        return purchaseunitMapper.updateByPrimaryKeySelective(record);
    }
}
