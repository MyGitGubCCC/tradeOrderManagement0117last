package com.xzit.service;

import com.github.pagehelper.PageInfo;
import com.xzit.entity.Member;
import com.xzit.entity.MemberExample;

import java.util.List;

/**
 * Created by Liu on 2018/1/9.
 */
public interface MemberService {
    List<Member> selectAllMember() throws Exception;

    public PageInfo<Member> selectByExample(MemberExample example, Integer pageNo, Integer pageSize)throws Exception;

    int deleteByPrimaryKey(Integer memberid)throws Exception;

    int insertSelective(Member record)throws Exception;

    int updateByPrimaryKeySelective(Member record)throws Exception;
}
