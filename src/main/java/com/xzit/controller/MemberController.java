package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Member;
import com.xzit.entity.MemberExample;
import com.xzit.service.MemberService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 董丹买东西 on 2018/1/14.
 */

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/member.action")
    public ModelAndView member()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("member/member");
        return mv;
    }


    @RequestMapping(value = "/selectMember.action")
    @ResponseBody
    public DataGrid<Member> selectMember(Member me , Integer page, Integer rows) throws Exception{

        MemberExample memberExample =new MemberExample();
        MemberExample.Criteria memberExampleCriteria =memberExample.createCriteria();
        memberExampleCriteria.andNameLike("%"+me.getName()+"%");

        PageInfo<Member> pageInfo= memberService.selectByExample(memberExample,page,rows);
        DataGrid<Member> dataGrid = new DataGrid<Member>();
        dataGrid.setTotal(pageInfo.getTotal());
        dataGrid.setRows(pageInfo.getList());
        return dataGrid;

    }



    @RequestMapping(value = "deleteMember.action")
    @ResponseBody
    public String  deleteMember(int memberid)throws Exception{
        String msg="删除失败！";
        if (memberService.deleteByPrimaryKey(memberid)==1){
            msg="删除成功";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            msg = mapper.writeValueAsString(msg);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return msg;
    }

    @RequestMapping(value = "insertOrUpdateMember.action")
    @ResponseBody
    public String insertOrUpdateMember(Member member) throws Exception{
        String msg="异常";
        int state=0;
        if (member.getMemberid()!=null){
            state = memberService.updateByPrimaryKeySelective(member);
            if (state==0) msg = "更新失败！请查看编号是否重复";
            else msg="更新成功";
        }else {
            state = memberService.insertSelective(member);
            if (state==0) msg = "插入失败！请查看编号是否重复";
            else msg="插入成功";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            msg = mapper.writeValueAsString(msg);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return msg;
    }
}
