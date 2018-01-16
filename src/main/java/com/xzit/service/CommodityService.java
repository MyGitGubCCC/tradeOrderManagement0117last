package com.xzit.service;

import com.xzit.entity.Commodity;
import com.xzit.entity.CommodityExample;

import java.util.List;

/**
 * Created by Liu on 2018/1/9.
 */
public interface CommodityService {
    int insertCommodity(Commodity record) throws Exception;
    List<Commodity> selectByExample(CommodityExample example);
}
