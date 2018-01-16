package com.xzit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Member;
import com.xzit.entity.MemberExample;
import com.xzit.mapper.MemberMapper;
import com.xzit.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Liu on 2018/1/9.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    @Qualifier("memberMapper")
    private MemberMapper memberMapper;

    public List<Member> selectAllMember() throws Exception {
        return memberMapper.selectAllMember();
    }


    public PageInfo<Member> selectByExample(MemberExample example, Integer pageNo, Integer pageSize) throws Exception {

        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);//步骤1
        List<Member> list = memberMapper.selectByExample(example);
        //用PageInfo对结果进行包装
        PageInfo<Member> page = new PageInfo<Member>(list);//步骤2
        return page;

    }

    public int deleteByPrimaryKey(Integer memberid) throws Exception {
        return memberMapper.deleteByPrimaryKey(memberid);
    }

    public int insertSelective(Member record) throws Exception {
        return memberMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Member record) throws Exception {
        return memberMapper.updateByPrimaryKeySelective(record);

    }




}
