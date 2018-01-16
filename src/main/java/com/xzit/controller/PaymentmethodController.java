package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Paymentmethod;
import com.xzit.entity.PaymentmethodExample;
import com.xzit.service.PaymentmethodService;
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
public class PaymentmethodController {

    @Autowired
    private PaymentmethodService paymentmethodService;

    @RequestMapping(value = "/paymentMethod.action")
    public ModelAndView paymentMethod()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("paymentMethod/paymentMethod");
        return mv;
    }



    @RequestMapping(value = "/selectPaymentMethod.action")
    @ResponseBody
    public DataGrid<Paymentmethod> selectPaymentMethod(Paymentmethod pa, Integer page, Integer rows) throws Exception{

        PaymentmethodExample paymentmethodExample =new PaymentmethodExample();
        PaymentmethodExample.Criteria paymentmethodExampleCriteria=paymentmethodExample.createCriteria();

        paymentmethodExampleCriteria.andNameLike("%"+pa.getName()+"%");

        PageInfo<Paymentmethod> pageInfo=paymentmethodService.selectByExample(paymentmethodExample,page,rows);
        DataGrid<Paymentmethod> dataGrid = new DataGrid<Paymentmethod>();
        dataGrid.setTotal(pageInfo.getTotal());
        dataGrid.setRows(pageInfo.getList());
        return dataGrid;

    }



    @RequestMapping(value = "deletePaymentMethod.action")
    @ResponseBody
    public String  deletePaymentMethod(int paymentmethodid)throws Exception{
        String msg="删除失败！";
        if (paymentmethodService.deleteByPrimaryKey(paymentmethodid)==1){
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

    @RequestMapping(value = "insertOrUpdatePaymentMethod.action")
    @ResponseBody
    public String insertOrUpdatePaymentMethod(Paymentmethod paymentmethod) throws Exception{
        String msg="异常";
        int state=0;
        if (paymentmethod.getPaymentmethodid()!=null){
            state = paymentmethodService.updateByPrimaryKeySelective(paymentmethod);
            if (state==0) msg = "更新失败！请查看编号是否重复";
            else msg="更新成功";
        }else {
            state = paymentmethodService.insertSelective(paymentmethod);
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
