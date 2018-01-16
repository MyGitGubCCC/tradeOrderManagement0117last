package com.xzit.mapper;

import com.xzit.entity.Customerorder;
import com.xzit.entity.CustomerorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerorderMapper {
    int countByExample(CustomerorderExample example);

    int deleteByExample(CustomerorderExample example);

    int deleteByPrimaryKey(Integer customerorderid);

    int insert(Customerorder record);

    int insertSelective(Customerorder record);

    List<Customerorder> selectByExample(CustomerorderExample example);

    Customerorder selectByPrimaryKey(Integer customerorderid);

    int updateByExampleSelective(@Param("record") Customerorder record, @Param("example") CustomerorderExample example);

    int updateByExample(@Param("record") Customerorder record, @Param("example") CustomerorderExample example);

    int updateByPrimaryKeySelective(Customerorder record);

    int updateByPrimaryKey(Customerorder record);
}