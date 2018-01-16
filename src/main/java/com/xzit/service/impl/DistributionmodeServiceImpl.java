package com.xzit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.regexp.internal.RE;
import com.xzit.entity.Distributionmode;
import com.xzit.entity.DistributionmodeExample;
import com.xzit.mapper.DistributionmodeMapper;
import com.xzit.service.DistributionmodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuyanyan on 2018/1/11.
 */
@Service
public class DistributionmodeServiceImpl implements DistributionmodeService {
    @Autowired
    private DistributionmodeMapper distributionmodeMapper;

    public PageInfo<Distributionmode> selectByExample(DistributionmodeExample example, Integer pageNo, Integer pageSize) throws Exception {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);//步骤1
        List<Distributionmode> list = distributionmodeMapper.selectByExample(example);
        //用PageInfo对结果进行包装
        PageInfo<Distributionmode> page = new PageInfo<Distributionmode>(list);//步骤2
        return page;

    }

    public int deleteDistributionmodeid(Integer distributionmodeid) throws Exception {
        return distributionmodeMapper.deleteByPrimaryKey(distributionmodeid);
    }

    public int insertSelective(Distributionmode record) throws Exception {
        return distributionmodeMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Distributionmode record) throws Exception {
        return distributionmodeMapper.updateByPrimaryKey(record);
    }

    public List<Distributionmode> selectAlldistributionmode() throws Exception {
        return distributionmodeMapper.selectAlldistributionmode();
    }


}
