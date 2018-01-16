package com.xzit.mapper;

import com.xzit.entity.Creditlimit;
import com.xzit.entity.CreditlimitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditlimitMapper {
    int countByExample(CreditlimitExample example);

    int deleteByExample(CreditlimitExample example);

    int deleteByPrimaryKey(Integer creditlimitid);

    int insert(Creditlimit record);

    int insertSelective(Creditlimit record);

    List<Creditlimit> selectByExample(CreditlimitExample example);

    Creditlimit selectByPrimaryKey(Integer creditlimitid);

    int updateByExampleSelective(@Param("record") Creditlimit record, @Param("example") CreditlimitExample example);

    int updateByExample(@Param("record") Creditlimit record, @Param("example") CreditlimitExample example);

    int updateByPrimaryKeySelective(Creditlimit record);

    int updateByPrimaryKey(Creditlimit record);

    int insertCreditlimitInfo(Creditlimit record);
}