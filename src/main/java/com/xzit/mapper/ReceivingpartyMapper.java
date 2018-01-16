package com.xzit.mapper;

import com.xzit.entity.Receivingparty;
import com.xzit.entity.ReceivingpartyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReceivingpartyMapper {
    int countByExample(ReceivingpartyExample example);

    int deleteByExample(ReceivingpartyExample example);

    int deleteByPrimaryKey(Integer receivingpartyid);

    int insert(Receivingparty record);

    int insertSelective(Receivingparty record);

    List<Receivingparty> selectByExample(ReceivingpartyExample example);

    Receivingparty selectByPrimaryKey(Integer receivingpartyid);

    int updateByExampleSelective(@Param("record") Receivingparty record, @Param("example") ReceivingpartyExample example);

    int updateByExample(@Param("record") Receivingparty record, @Param("example") ReceivingpartyExample example);

    int updateByPrimaryKeySelective(Receivingparty record);

    int updateByPrimaryKey(Receivingparty record);

    int insertReceivingparty(Receivingparty record);

}