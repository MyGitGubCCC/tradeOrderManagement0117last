package com.xzit.mapper;

import com.xzit.entity.Consignmentlist;
import com.xzit.entity.ConsignmentlistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsignmentlistMapper {
    //查出收货方id，为了送入托运单
    int selectReceivingPartyIdByWaybillNumber(String waybillNumber)throws Exception;

    int countByExample(ConsignmentlistExample example);

    int deleteByExample(ConsignmentlistExample example);

    int deleteByPrimaryKey(Integer consignmentlistid);

    int insert(Consignmentlist record);

    int insertSelective(Consignmentlist record);

    List<Consignmentlist> selectByExample(ConsignmentlistExample example);

    List<Consignmentlist> selectAllConsignmentlist(ConsignmentlistExample example);

    Consignmentlist selectByPrimaryKey(Integer consignmentlistid);

    int updateByExampleSelective(@Param("record") Consignmentlist record, @Param("example") ConsignmentlistExample example);

    int updateByExample(@Param("record") Consignmentlist record, @Param("example") ConsignmentlistExample example);

    int updateByPrimaryKeySelective(Consignmentlist record);

    int updateByPrimaryKey(Consignmentlist record);
}