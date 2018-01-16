package com.xzit.mapper;

import com.xzit.entity.Distributionmode;
import com.xzit.entity.DistributionmodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistributionmodeMapper {
    int countByExample(DistributionmodeExample example);

    int deleteByExample(DistributionmodeExample example);

    int deleteByPrimaryKey(Integer distributionmodeid);

    int insert(Distributionmode record);

    int insertSelective(Distributionmode record);

    List<Distributionmode> selectByExample(DistributionmodeExample example);

    Distributionmode selectByPrimaryKey(Integer distributionmodeid);

    int updateByExampleSelective(@Param("record") Distributionmode record, @Param("example") DistributionmodeExample example);

    int updateByExample(@Param("record") Distributionmode record, @Param("example") DistributionmodeExample example);

    int updateByPrimaryKeySelective(Distributionmode record);

    int updateByPrimaryKey(Distributionmode record);

    List<Distributionmode> selectAlldistributionmode();

}