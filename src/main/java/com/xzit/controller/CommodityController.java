package com.xzit.controller;

import com.xzit.entity.Commodity;
import com.xzit.entity.CommodityExample;
import com.xzit.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by caochengcheng on 2018/1/13.
 */
@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "selectAllCommodity.action")
    @ResponseBody
    public List<Commodity> selectAllCommodity()throws Exception{
        CommodityExample commodityExample = new CommodityExample();
        return commodityService.selectByExample(commodityExample);
    }
}
