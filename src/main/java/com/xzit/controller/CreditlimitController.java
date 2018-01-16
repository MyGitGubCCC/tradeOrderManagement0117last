package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.Creditlimit;
import com.xzit.entity.Purchaseunit;
import com.xzit.entity.Saleslist;
import com.xzit.service.CreditlimitService;
import com.xzit.service.PurchaseunitService;
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
 * Created by Liu on 2018/1/12.
 */
@Controller
public class CreditlimitController {

    @Autowired
    private CreditlimitService creditlimitService;

    @Autowired
    private PurchaseunitService purchaseunitService;

    @Autowired
    private SaleslistService saleslistService;

    /*签注信用额度---------------开始*/

    @RequestMapping(value = "/creditlimitlist.action")
    public ModelAndView creditlimitlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("creditlimit/creditlimit");
        return mv;
    }

    @RequestMapping(value = "/submitCreditlimit.action")
    @ResponseBody
    public String submitCreditlimit(Saleslist saleslist, Integer purchaseunitid, Creditlimit creditlimit) throws Exception{
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Creditlimit cre = new Creditlimit();
        cre.setIntercoursetime(creditlimit.getIntercoursetime());
        cre.setAuditaccountingname(creditlimit.getAuditaccountingname());
        cre.setMarketingdepartmentaccountid(creditlimit.getMarketingdepartmentaccountid());
        cre.setCreditsituationdescription(creditlimit.getCreditsituationdescription());
        cre.setCustomercapital(creditlimit.getCustomercapital());
        cre.setFinalreviewdate(sm.format(date).toString());
        int num = creditlimitService.insertCreditlimitInfo(cre);
        Purchaseunit pur = new Purchaseunit();
        pur.setPurchaseunitid(purchaseunitid);
        pur.setCreditlimitid(cre.getCreditlimitid());
        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        int num2 = 0;
        int num3 = 0;
        if(num>0){
            num2 = purchaseunitService.updateByPrimaryKeySelective(pur);
        }
        if(num2>0){
            num3 = saleslistService.updateByPrimaryKeySelective(sal);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num3 > 0){
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

    @RequestMapping(value = "/selectAllCreditlimit.action")
    @ResponseBody
    public DataGrid<Saleslist> selectAllCreditlimit(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllCheckSaleslist(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalCheckSaleslist(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }
    /*签注信用额度---------------结束*/

    /*审核信用额度---------------开始*/
    @RequestMapping(value = "/checkCreditlimitlist.action")
    public ModelAndView checkCreditlimitlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("creditlimit/checkCreditlimit");
        return mv;
    }
    @RequestMapping(value = "/selectcheckAllCreditlimit.action")
    @ResponseBody
    public DataGrid<Saleslist> selectcheckAllCreditlimit(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllCheckCreditlimit(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalCheckCreditlimit(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/checkCreditlimit.action")
    @ResponseBody
    public String checkCreditlimit(Saleslist saleslist, Creditlimit creditlimit) throws Exception{
        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        Creditlimit cre = new Creditlimit();
        cre.setCreditlimitid(creditlimit.getCreditlimitid());
        cre.setCustomername(creditlimit.getCustomername());
       /* 因为数据库创建时没有考虑到审核意见字段，
        在此将客户信用额度表中客户姓名当做审核意见字段*/
        int num = creditlimitService.updateByPrimaryKey(cre);
        int num2 = saleslistService.updateByPrimaryKeySelective(sal);
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num > 0 && num2>0){
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
    /*审核信用额度---------------结束*/

}
