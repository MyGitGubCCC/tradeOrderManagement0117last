package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Allocationlist;
import com.xzit.entity.Applytransferform;
import com.xzit.entity.Saleslist;
import com.xzit.service.AllocationlistService;
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
 * Created by Liu on 2018/1/14.
 */
@Controller
public class AllocationlistController {

    @Autowired
    private SaleslistService saleslistService;

    @Autowired
    private AllocationlistService allocationlistService;

    @Autowired
    private ApplytransferformService applytransferformService;

    /*填制配拨单---------------开始*/
    @RequestMapping(value = "/allocationlist.action")
    public ModelAndView allocationlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("allocationlist/allocationlist");
        return mv;
    }

    @RequestMapping(value = "/submitAllocationlist.action")
    @ResponseBody
    public String submitAllocationlist(Saleslist saleslist,Integer employeeid22, Applytransferform applytransferform, Allocationlist allocationlist) throws Exception{
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Allocationlist all = new Allocationlist();
        all.setAmmount(allocationlist.getAmmount());
        all.setEmployeename(allocationlist.getEmployeename());
        all.setEmployeeid(employeeid22);
        all.setCommodityname(allocationlist.getCommodityname());
        all.setAllocationopinion(allocationlist.getAllocationopinion());
        all.setAllocationtime(sm.format(date).toString());
        int num3=0,num=0,num2=0;
        num3 = allocationlistService.insertSelective(all);
        Applytransferform app = new Applytransferform();
        app.setApplytransferformid(applytransferform.getApplytransferformid());
        app.setAllocationlistid(all.getAllocationlistid());
        if(num3>0){
            num2 = applytransferformService.updateByPrimaryKeySelective(app);
        }
        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        if(num2>0){
            num = saleslistService.updateByPrimaryKeySelective(sal);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num>0){
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

    /*填制配拨单---------------结束*/


    /*审核配拨单---------------开始*/
    @RequestMapping(value = "/checkAllocationlist.action")
    public ModelAndView checkAllocationlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("allocationlist/checkAllocationlist");
        return mv;
    }

    @RequestMapping(value = "/selectcheckAllocationlist.action")
    @ResponseBody
    public DataGrid<Saleslist> selectcheckAllocationlist(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllAllocationlist(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalCheckSaleslist(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }


    @RequestMapping(value = "/submitCheckAllocationlist.action")
    @ResponseBody
    public String submitCheckAllocationlist(Saleslist saleslist, Allocationlist allocationlist) throws Exception{
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Allocationlist all = new Allocationlist();
        all.setCheckname(allocationlist.getCheckname());
        all.setChecktime(sm.format(date).toString());
        all.setCheckemployeeid(allocationlist.getCheckemployeeid());
        all.setAllocationlistid(allocationlist.getAllocationlistid());
        int num=0,num2=0;
        num2 = allocationlistService.updateByPrimaryKeySelective(all);

        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        if(num2>0){
            num = saleslistService.updateByPrimaryKeySelective(sal);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num>0){
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
    /*审核配拨单---------------结束*/
}
