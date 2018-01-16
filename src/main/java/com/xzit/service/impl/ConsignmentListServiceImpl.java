package com.xzit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Consignmentlist;
import com.xzit.entity.ConsignmentlistExample;
import com.xzit.mapper.ConsignmentlistMapper;
import com.xzit.service.ConsignmentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
@Service
public class ConsignmentListServiceImpl implements ConsignmentListService {

    @Autowired
    private ConsignmentlistMapper consignmentlistMapper;

    public PageInfo<Consignmentlist> selectAllConsignmentlist(ConsignmentlistExample example, Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);//步骤1
        List<Consignmentlist> list = consignmentlistMapper.selectAllConsignmentlist(example);
        //用PageInfo对结果进行包装
        PageInfo<Consignmentlist> page = new PageInfo<Consignmentlist>(list);//步骤2
        return page;
    }

    public int insertSelective(Consignmentlist record) {
        return consignmentlistMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Consignmentlist record) {
        return consignmentlistMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteByPrimaryKey(Integer consignmentlistid) {
        return consignmentlistMapper.deleteByPrimaryKey(consignmentlistid);
    }

    public int selectReceivingPartyIdByWaybillNumber(String waybillNumber) throws Exception {
        return consignmentlistMapper.selectReceivingPartyIdByWaybillNumber(waybillNumber);
    }
}
