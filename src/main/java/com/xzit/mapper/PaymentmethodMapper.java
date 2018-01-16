package com.xzit.mapper;

import com.xzit.entity.Paymentmethod;
import com.xzit.entity.PaymentmethodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentmethodMapper {
    int countByExample(PaymentmethodExample example);

    int deleteByExample(PaymentmethodExample example);

    int deleteByPrimaryKey(Integer paymentmethodid);

    int insert(Paymentmethod record);

    int insertSelective(Paymentmethod record);

    List<Paymentmethod> selectByExample(PaymentmethodExample example);

    Paymentmethod selectByPrimaryKey(Integer paymentmethodid);

    int updateByExampleSelective(@Param("record") Paymentmethod record, @Param("example") PaymentmethodExample example);

    int updateByExample(@Param("record") Paymentmethod record, @Param("example") PaymentmethodExample example);

    int updateByPrimaryKeySelective(Paymentmethod record);

    int updateByPrimaryKey(Paymentmethod record);

    List<Paymentmethod> selectAllpaymentmethod();

}