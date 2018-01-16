package com.xzit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Deliverynote;
import com.xzit.entity.DeliverynoteExample;
import com.xzit.mapper.DeliverynoteMapper;
import com.xzit.service.DeliverynoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caochengcheng on 2018/1/7.
 */
@Service
public class DeliverynoteServiceImpl implements DeliverynoteService {
    @Autowired
    private DeliverynoteMapper deliverynoteMapper;

    public List<Deliverynote> selectByExample(DeliverynoteExample example) {
        return deliverynoteMapper.selectByExample(example);
    }

    public PageInfo<Deliverynote> selectAllDeliveryNote(DeliverynoteExample example, Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);//步骤1
        List<Deliverynote> list = deliverynoteMapper.selectAllDeliveryNote(example);
        //用PageInfo对结果进行包装
        PageInfo<Deliverynote> page = new PageInfo<Deliverynote>(list);//步骤2
        return page;
    }

    public int updateByPrimaryKeySelective(Deliverynote record) {
        return deliverynoteMapper.updateByPrimaryKeySelective(record);
    }

    public int insertSelective(Deliverynote record) {
        return deliverynoteMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer deliverynoteid) {
        return deliverynoteMapper.deleteByPrimaryKey(deliverynoteid);
    }


}
