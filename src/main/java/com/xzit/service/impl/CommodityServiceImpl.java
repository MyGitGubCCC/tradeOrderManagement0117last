package com.xzit.service.impl;

import com.xzit.entity.Commodity;
import com.xzit.entity.CommodityExample;
import com.xzit.mapper.CommodityMapper;
import com.xzit.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/9.
 */
@Service
public class CommodityServiceImpl implements CommodityService{

    @Autowired
    @Qualifier("commodityMapper")
    private CommodityMapper commodityMapper;

    public int insertCommodity(Commodity record) throws Exception {
        return commodityMapper.insertCommodity(record);
    }
    public List<Commodity> selectByExample(CommodityExample example) {
        return commodityMapper.selectByExample(example);
    }
}
