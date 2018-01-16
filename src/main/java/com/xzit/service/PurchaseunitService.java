package com.xzit.service;

import com.xzit.entity.Purchaseunit;

/**
 * Created by Liu on 2018/1/9.
 */
public interface PurchaseunitService {
    int insertPurchaseunit(Purchaseunit record) throws Exception;
    int updateByPrimaryKeySelective(Purchaseunit record) throws Exception;
}
