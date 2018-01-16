package com.xzit.service;

import com.xzit.entity.Saleslist;
import com.xzit.entity.SaleslistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Liu on 2018/1/4.
 */
public interface SaleslistService {
    int insertSelective(Saleslist record) throws Exception;
    List<Saleslist> selectAllSaleslist(Saleslist record, Integer page, Integer rows) throws Exception;
    int totalSaleslist(Saleslist record) throws Exception;

    List<Saleslist> selectAllSaleslistXiaohsou(Saleslist record, Integer page, Integer rows) throws Exception;
    int totalSaleslistXiaohsou(Saleslist record) throws Exception;

    List<Saleslist> selectAllCheckSaleslist(Saleslist record, Integer page, Integer rows) throws Exception;
    int totalCheckSaleslist(Saleslist record) throws Exception;

    int updateByPrimaryKeySelective(Saleslist record) throws Exception;

    List<Saleslist> selectAllCheckCreditlimit(Saleslist record,Integer page, Integer rows) throws Exception;
    int totalCheckCreditlimit(Saleslist record) throws Exception;

    List<Saleslist> selectAllApplyForm(Saleslist record, Integer page, Integer rows);

    List<Saleslist> selectAllAllocationlist(Saleslist record,Integer page, Integer rows);

    //曹成成
    List<Saleslist> selectByExample(SaleslistExample example);
}
