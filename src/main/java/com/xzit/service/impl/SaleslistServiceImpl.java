package com.xzit.service.impl;

import com.xzit.entity.Saleslist;
import com.xzit.entity.SaleslistExample;
import com.xzit.mapper.SaleslistMapper;
import com.xzit.service.SaleslistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/4.
 */
@Service
public class SaleslistServiceImpl implements SaleslistService{

    @Autowired
    @Qualifier("saleslistMapper")
    private SaleslistMapper saleslistMapper;

    public int insertSelective(Saleslist record) throws Exception {
        return saleslistMapper.insertSelective(record);
    }

    public List<Saleslist> selectAllSaleslist(Saleslist record, Integer page, Integer rows) throws Exception {
        return saleslistMapper.selectAllSaleslist(record,page,rows);
    }

    public int totalSaleslist(Saleslist record) throws Exception {
        return saleslistMapper.totalSaleslist(record);
    }

    public List<Saleslist> selectAllSaleslistXiaohsou(Saleslist record, Integer page, Integer rows) throws Exception {
        List<Saleslist> returnList = null;
        if((record.getOrderstatus2()).compareTo("2") < 0){
            returnList = saleslistMapper.saleslistxiaoshouComplete(record,page,rows);
        }else if((record.getOrderstatus2()).compareTo("2") == 0){
            returnList = saleslistMapper.selectAllSaleslistXiaohsou(record,page,rows);
        }else if((record.getOrderstatus2()).compareTo("2") > 0){
            returnList = saleslistMapper.saleslistxiaoshouManager(record,page,rows);
        }
        return returnList;
    }

    public int totalSaleslistXiaohsou(Saleslist record) throws Exception {
        int total = 0;
        if((record.getOrderstatus2()).compareTo("2") < 0){
            total = saleslistMapper.totalsaleslistxiaoshouComplete(record);
        }else if((record.getOrderstatus2()).compareTo("2") == 0){
            total = saleslistMapper.totalSaleslistXiaohsou(record);
        }else if((record.getOrderstatus2()).compareTo("2") > 0){
            total = saleslistMapper.totalsaleslistxiaoshouManager(record);
        }
        return total;
    }

    public List<Saleslist> selectAllCheckSaleslist(Saleslist record, Integer page, Integer rows)  throws Exception{
        return saleslistMapper.selectAllCheckSaleslist(record,page,rows);
    }

    public int totalCheckSaleslist(Saleslist record) throws Exception {
        return saleslistMapper.totalCheckSaleslist(record);
    }

    public int updateByPrimaryKeySelective(Saleslist record) throws Exception {
        return saleslistMapper.updateByPrimaryKeySelective(record);
    }

    public List<Saleslist> selectAllCheckCreditlimit(Saleslist record, Integer page, Integer rows) throws Exception {
        return saleslistMapper.selectAllCheckCreditlimit(record,page,rows);
    }

    public int totalCheckCreditlimit(Saleslist record) throws Exception {
        return saleslistMapper.totalCheckCreditlimit(record);
    }

    public List<Saleslist> selectAllApplyForm(Saleslist record, Integer page, Integer rows) {
        return saleslistMapper.selectAllApplyForm(record,page,rows);
    }

    public List<Saleslist> selectAllAllocationlist(Saleslist record, Integer page, Integer rows) {
        return saleslistMapper.selectAllAllocationlist(record,page,rows);
    }

    public List<Saleslist> selectByExample(SaleslistExample example) {
        return saleslistMapper.selectAllSalasList(example);
    }
}
