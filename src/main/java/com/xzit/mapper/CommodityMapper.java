package com.xzit.mapper;

import com.xzit.entity.Commodity;
import com.xzit.entity.CommodityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityMapper {
    int countByExample(CommodityExample example);

    int deleteByExample(CommodityExample example);

    int deleteByPrimaryKey(Integer commodityid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    List<Commodity> selectByExample(CommodityExample example);

    Commodity selectByPrimaryKey(Integer commodityid);

    int updateByExampleSelective(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByExample(@Param("record") Commodity record, @Param("example") CommodityExample example);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);


    int insertCommodity(Commodity record);

}