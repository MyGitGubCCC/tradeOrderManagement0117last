package com.xzit.service;

import com.github.pagehelper.PageInfo;
import com.xzit.entity.Consignmentlist;
import com.xzit.entity.ConsignmentlistExample;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public interface ConsignmentListService {
    PageInfo<Consignmentlist> selectAllConsignmentlist(ConsignmentlistExample example, Integer pageNo, Integer pageSize);
    int insertSelective(Consignmentlist record);
    int updateByPrimaryKeySelective(Consignmentlist record);
    int deleteByPrimaryKey(Integer consignmentlistid);

    int selectReceivingPartyIdByWaybillNumber(String waybillNumber)throws Exception;
}
