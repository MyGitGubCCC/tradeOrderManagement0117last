package com.xzit.service;

import com.github.pagehelper.PageInfo;
import com.xzit.entity.Deliverynote;
import com.xzit.entity.DeliverynoteExample;

import java.util.List;

/**
 * Created by caochengcheng on 2018/1/7.
 */
public interface DeliverynoteService {
    List<Deliverynote> selectByExample(DeliverynoteExample example);
    PageInfo<Deliverynote> selectAllDeliveryNote(DeliverynoteExample example, Integer pageNo, Integer pageSize);
    int updateByPrimaryKeySelective(Deliverynote record);
    int insertSelective(Deliverynote record);
    int deleteByPrimaryKey(Integer deliverynoteid);
}
