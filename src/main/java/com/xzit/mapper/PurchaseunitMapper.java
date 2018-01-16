package com.xzit.mapper;

import com.xzit.entity.Purchaseunit;
import com.xzit.entity.PurchaseunitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseunitMapper {
    int countByExample(PurchaseunitExample example);

    int deleteByExample(PurchaseunitExample example);

    int deleteByPrimaryKey(Integer purchaseunitid);

    int insert(Purchaseunit record);

    int insertSelective(Purchaseunit record);

    List<Purchaseunit> selectByExample(PurchaseunitExample example);

    Purchaseunit selectByPrimaryKey(Integer purchaseunitid);
    Purchaseunit selectByPrimaryKey2(Integer purchaseunitid);
    Purchaseunit selectByPrimaryKey3(Integer purchaseunitid);

    int updateByExampleSelective(@Param("record") Purchaseunit record, @Param("example") PurchaseunitExample example);

    int updateByExample(@Param("record") Purchaseunit record, @Param("example") PurchaseunitExample example);

    int updateByPrimaryKeySelective(Purchaseunit record);

    int updateByPrimaryKey(Purchaseunit record);

    int insertPurchaseunit(Purchaseunit record);
}