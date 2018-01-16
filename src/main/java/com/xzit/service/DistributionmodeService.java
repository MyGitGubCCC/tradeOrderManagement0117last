package com.xzit.service;

import com.github.pagehelper.PageInfo;
import com.xzit.entity.Distributionmode;
import com.xzit.entity.DistributionmodeExample;

import java.util.List;

/**
 * Created by liuyanyan on 2018/1/11.
 */

public interface DistributionmodeService {
    public PageInfo<Distributionmode> selectByExample(DistributionmodeExample example, Integer pageNo, Integer pageSize) throws Exception ;
    int deleteDistributionmodeid(Integer distributionmodeid) throws Exception;
    int insertSelective(Distributionmode record) throws Exception;
    int updateByPrimaryKeySelective(Distributionmode record) throws Exception;
    List<Distributionmode>  selectAlldistributionmode()throws Exception;
    }
