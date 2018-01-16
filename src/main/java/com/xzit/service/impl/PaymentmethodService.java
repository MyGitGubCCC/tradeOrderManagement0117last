package com.xzit.service.impl;

import com.github.pagehelper.PageInfo;
import com.xzit.entity.Paymentmethod;
import com.xzit.entity.PaymentmethodExample;

import java.util.List;

/**
 * Created by Liu on 2018/1/7.
 */
public interface PaymentmethodService {
    List<Paymentmethod> selectAllpaymentmethod() throws Exception;

    public PageInfo<Paymentmethod> selectByExample(PaymentmethodExample example, Integer pageNo, Integer pageSize)throws Exception;

    int deleteByPrimaryKey(Integer paymentmethodid)throws Exception;

    int insertSelective(Paymentmethod record)throws Exception;

    int updateByPrimaryKeySelective(Paymentmethod record)throws Exception;

}
