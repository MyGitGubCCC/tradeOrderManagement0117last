package com.xzit.mapper;

import com.xzit.entity.Deliverynote;
import com.xzit.entity.DeliverynoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliverynoteMapper {
    int countByExample(DeliverynoteExample example);

    int deleteByExample(DeliverynoteExample example);

    int deleteByPrimaryKey(Integer deliverynoteid);

    int insert(Deliverynote record);

    int insertSelective(Deliverynote record);

    List<Deliverynote> selectByExample(DeliverynoteExample example);

    List<Deliverynote> selectAllDeliveryNote(DeliverynoteExample example);

    Deliverynote selectByPrimaryKey(Integer deliverynoteid);

    int updateByExampleSelective(@Param("record") Deliverynote record, @Param("example") DeliverynoteExample example);

    int updateByExample(@Param("record") Deliverynote record, @Param("example") DeliverynoteExample example);

    int updateByPrimaryKeySelective(Deliverynote record);

    int updateByPrimaryKey(Deliverynote record);
}