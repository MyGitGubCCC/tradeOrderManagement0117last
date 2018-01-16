package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Applytransferform;
import com.xzit.entity.Creditlimit;
import com.xzit.entity.Saleslist;
import com.xzit.service.ApplytransferformService;
import com.xzit.service.SaleslistService;
import com.xzit.until.DataGrid;
import com.xzit.until.Shenpizhuangtai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Liu on 2018/1/13.
 */
@Controller
public class ApplyTransferFormController {

    @Autowired
    private SaleslistService saleslistService;

    @Autowired
    private ApplytransferformService applytransferformService;

    /*调拨申请------------------开始*/
    @RequestMapping(value = "/applyTransferForm.action")
    public ModelAndView applyTransferForm()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("applyTransferForm/applyTransferForm");
        return mv;
    }


    @RequestMapping(value = "/submitApplyTransferForm.action")
    @ResponseBody
    public String submitApplyTransferForm(Saleslist saleslist, Applytransferform applytransferform) throws Exception{
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Applytransferform app = new Applytransferform();
        app.setSaleslistid(saleslist.getSaleslistid());
        app.setTransfermanid(applytransferform.getTransfermanid());
        app.setComment(applytransferform.getComment());
        app.setTransfertime(sm.format(date).toString());

        int num1 = applytransferformService.insertSelective2(app);

        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setPaymentmethodno(saleslist.getPaymentmethodno());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        sal.setApplytransferformid(app.getApplytransferformid());
        int num=0;
        if(num1>0){
            num = saleslistService.updateByPrimaryKeySelective(sal);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num > 0){
            str="提交成功！";
        }else{
            str="提交失败！";
        }
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
    /*调拨申请------------------结束*/

    /*签具调拨申请------------------开始*/
    @RequestMapping(value = "/checkApplyTransferForm.action")
    public ModelAndView checkApplyTransferForm()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("checkApplyTransferForm/checkApplyTransferForm");
        return mv;
    }


    @RequestMapping(value = "/selectAllApplyForm.action")
    @ResponseBody
    public DataGrid<Saleslist> selectAllApplyForm(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllApplyForm(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalCheckSaleslist(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/submitCheckApplyTransferForm.action")
    @ResponseBody
    public String submitCheckApplyTransferForm(Saleslist saleslist) throws Exception{
        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setDeliverymethodno(saleslist.getDeliverymethodno());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        int num = saleslistService.updateByPrimaryKeySelective(sal);
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(true){
            str="提交成功！";
        }else{
            str="提交失败！";
        }
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
    /*签具调拨申请------------------结束*/

}
