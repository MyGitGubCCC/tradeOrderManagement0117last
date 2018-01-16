package com.xzit.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Paymentmethod;
import com.xzit.entity.PaymentmethodExample;
import com.xzit.mapper.PaymentmethodMapper;
import com.xzit.service.PaymentmethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/7.
 */
@Service
public class PaymentmethodServiceImpl implements PaymentmethodService {

    @Autowired
    @Qualifier("paymentmethodMapper")
    private PaymentmethodMapper paymentmethodMapper;

    public List<Paymentmethod> selectAllpaymentmethod() throws Exception {
        return paymentmethodMapper.selectAllpaymentmethod();
    }

    public PageInfo<Paymentmethod> selectByExample(PaymentmethodExample example, Integer pageNo, Integer pageSize) throws Exception {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);//步骤1
        List<Paymentmethod> list = paymentmethodMapper.selectByExample(example);
        //用PageInfo对结果进行包装
        PageInfo<Paymentmethod> page = new PageInfo<Paymentmethod>(list);//步骤2
        return page;



    }

    public int deleteByPrimaryKey(Integer paymentmethodid) throws Exception {
        return paymentmethodMapper.deleteByPrimaryKey(paymentmethodid);

    }

    public int insertSelective(Paymentmethod record) throws Exception {
        return paymentmethodMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Paymentmethod record) throws Exception {
        return paymentmethodMapper.updateByPrimaryKeySelective(record);
    }
}
