package com.xzit.mapper;

import com.xzit.entity.Applytransferform;
import com.xzit.entity.ApplytransferformExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplytransferformMapper {
    int countByExample(ApplytransferformExample example);

    int deleteByExample(ApplytransferformExample example);

    int deleteByPrimaryKey(Integer applytransferformid);

    int insert(Applytransferform record);

    int insertSelective(Applytransferform record);
    int insertSelective2(Applytransferform record);

    List<Applytransferform> selectByExample(ApplytransferformExample example);

    Applytransferform selectByPrimaryKey(Integer applytransferformid);
    Applytransferform selectByPrimaryKey2(Integer applytransferformid);

    int updateByExampleSelective(@Param("record") Applytransferform record, @Param("example") ApplytransferformExample example);

    int updateByExample(@Param("record") Applytransferform record, @Param("example") ApplytransferformExample example);

    int updateByPrimaryKeySelective(Applytransferform record);

    int updateByPrimaryKey(Applytransferform record);
}