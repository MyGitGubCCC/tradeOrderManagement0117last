package com.xzit.mapper;

import com.xzit.entity.Applicationcancelling;
import com.xzit.entity.ApplicationcancellingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationcancellingMapper {
    int countByExample(ApplicationcancellingExample example);

    int deleteByExample(ApplicationcancellingExample example);

    int deleteByPrimaryKey(Integer applicationcancellingid);

    int insert(Applicationcancelling record);

    int insertSelective(Applicationcancelling record);

    List<Applicationcancelling> selectByExample(ApplicationcancellingExample example);

    Applicationcancelling selectByPrimaryKey(Integer applicationcancellingid);

    int updateByExampleSelective(@Param("record") Applicationcancelling record, @Param("example") ApplicationcancellingExample example);

    int updateByExample(@Param("record") Applicationcancelling record, @Param("example") ApplicationcancellingExample example);

    int updateByPrimaryKeySelective(Applicationcancelling record);

    int updateByPrimaryKey(Applicationcancelling record);
}