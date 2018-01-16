package com.xzit.mapper;

import com.xzit.entity.Saleslist;
import com.xzit.entity.SaleslistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleslistMapper {
    int countByExample(SaleslistExample example);

    int deleteByExample(SaleslistExample example);

    int deleteByPrimaryKey(Integer saleslistid);

    int insert(Saleslist record);

    int insertSelective(Saleslist record);

    List<Saleslist> selectByExample(SaleslistExample example);

    Saleslist selectByPrimaryKey(Integer saleslistid);

    int updateByExampleSelective(@Param("record") Saleslist record, @Param("example") SaleslistExample example);

    int updateByExample(@Param("record") Saleslist record, @Param("example") SaleslistExample example);

    int updateByPrimaryKeySelective(Saleslist record);

    int updateByPrimaryKey(Saleslist record);

    List<Saleslist> selectAllSaleslist(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalSaleslist(@Param("rec") Saleslist record);

    List<Saleslist> saleslistxiaoshouComplete(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalsaleslistxiaoshouComplete(@Param("rec") Saleslist record);

    List<Saleslist> saleslistxiaoshouManager(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalsaleslistxiaoshouManager(@Param("rec") Saleslist record);

    List<Saleslist> selectAllSaleslistXiaohsou(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalSaleslistXiaohsou(@Param("rec") Saleslist record);

    List<Saleslist> selectAllCheckSaleslist(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalCheckSaleslist(@Param("rec") Saleslist record);

    List<Saleslist> selectAllCheckCreditlimit(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);
    int totalCheckCreditlimit(@Param("rec") Saleslist record);

    List<Saleslist> selectAllApplyForm(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);

    List<Saleslist> selectAllAllocationlist(@Param("rec") Saleslist record,@Param("page") Integer page, @Param("rows") Integer rows);

    //曹成成
    List<Saleslist> selectAllSalasList(SaleslistExample example);

    Saleslist selectInfoByPrimaryKey(Integer saleslistid);
}