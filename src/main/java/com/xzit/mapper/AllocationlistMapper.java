package com.xzit.mapper;

import com.xzit.entity.Allocationlist;
import com.xzit.entity.AllocationlistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AllocationlistMapper {
    int countByExample(AllocationlistExample example);

    int deleteByExample(AllocationlistExample example);

    int deleteByPrimaryKey(Integer allocationlistid);

    int insert(Allocationlist record);

    int insertSelective(Allocationlist record);

    List<Allocationlist> selectByExample(AllocationlistExample example);

    Allocationlist selectByPrimaryKey(Integer allocationlistid);

    int updateByExampleSelective(@Param("record") Allocationlist record, @Param("example") AllocationlistExample example);

    int updateByExample(@Param("record") Allocationlist record, @Param("example") AllocationlistExample example);

    int updateByPrimaryKeySelective(Allocationlist record);

    int updateByPrimaryKey(Allocationlist record);
}