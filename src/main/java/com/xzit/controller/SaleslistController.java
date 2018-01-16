package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzit.entity.*;
import com.xzit.service.*;
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
 * Created by Liu on 2018/1/4.
 */
@Controller
public class SaleslistController {

    @Autowired
    private DistributionmodeService distributionmodeService;

    @Autowired
    private PaymentmethodService paymentmethodService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private PurchaseunitService purchaseunitService;

    @Autowired
    private ReceivingpartyService receivingpartyService;

    @Autowired
    private SaleslistService saleslistService;


    @RequestMapping(value = "/saleslist.action")
    public ModelAndView saleslist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("saleslist/saleslist");
        return mv;
    }

    @RequestMapping(value = "/saleslist2.action")
    public ModelAndView saleslist2()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("saleslist/citiselect");
        return mv;
    }

    @RequestMapping(value = "/allDistributionmode.action")
    @ResponseBody
    public List<Distributionmode> allDistributionmode() throws Exception{
        return distributionmodeService.selectAlldistributionmode();
    }

    @RequestMapping(value = "/allPaymentmethod.action")
    @ResponseBody
    public List<Paymentmethod> allPaymentmethod() throws Exception{
        return paymentmethodService.selectAllpaymentmethod();
    }

    @RequestMapping(value = "/allMember.action")
    @ResponseBody
    public List<Member> allMember() throws Exception{
        return memberService.selectAllMember();
    }

    /*填写订单---------开始*/
    @RequestMapping(value = "/updateSaleslist.action")
    @ResponseBody
    public String updateSaleslist(Employee employee,Paymentmethod paymentmethod,Purchaseunit purchaseunit,
                                Saleslist saleslist,Commodity commodity,Receivingparty receivingparty,
                                  Distributionmode distributionmode) throws Exception{
        Purchaseunit pur = new Purchaseunit();
        pur.setContactInformation(purchaseunit.getContactInformation());
        pur.setCreditlimitid(purchaseunit.getCreditlimitid());
        pur.setMembershipid(4);
        pur.setName(purchaseunit.getName());
        pur.setPlace(purchaseunit.getPlace());
        pur.setCustomerorderid(purchaseunit.getCustomerorderid());

        int num1 = commodityService.insertCommodity(commodity);
        int num2 = purchaseunitService.insertPurchaseunit(pur);
        int num3 = receivingpartyService.insertReceivingparty(receivingparty);
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Saleslist sal  =new Saleslist();
        sal.setEmployeeid(employee.getEmployeeid());
        sal.setPurchaseunitid(pur.getPurchaseunitid());
        sal.setCommodityid(commodity.getCommodityid());
        sal.setReceivingpartyid(receivingparty.getReceivingpartyid());
        sal.setDistributionmodeid(distributionmode.getDistributionmodeid());
        sal.setPaymentmethodid(paymentmethod.getPaymentmethodid());
        sal.setDue(saleslist.getDue());
        sal.setExpressfee(saleslist.getExpressfee());
        sal.setOrdertime( sm.format(date).toString());
        sal.setConsigneeno(saleslist.getConsigneeno());
        sal.setExpectdeliverydate(saleslist.getExpectdeliverydate());
        sal.setActualpayment(saleslist.getActualpayment());
        sal.setPaymenttime(saleslist.getPaymenttime());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState("2"));
        sal.setOrderstatus2("2");
        int num=0;
        if(num1 > 0 && num2 > 0 && num3 > 0){
            num = saleslistService.insertSelective(sal);
        }
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num>0){
            str="增加成功！";
        }else{
            str="增加失败！";
        }
        try {
            str = mapper.writeValueAsString(str);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }


    @RequestMapping(value = "/selectAllSaleslist.action")
    @ResponseBody
    public DataGrid<Saleslist> selectAllSaleslist(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllSaleslist(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalSaleslist(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }
    /*填写订单---------结束*/


    /*提交销售清单部分---------开始*/
    @RequestMapping(value = "/saleslistXiaoshou.action")
    public ModelAndView saleslistXiaoshou()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("saleslist/saleslistxiaoshou");
        return mv;
    }

    @RequestMapping(value = "/selectAllSaleslistXiaoshou.action")
    @ResponseBody
    public DataGrid<Saleslist> selectAllSaleslistXiaoshou(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllSaleslistXiaohsou(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalSaleslistXiaohsou(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/updateAllSaleslistXiaoshou.action")
    @ResponseBody
    public String updateAllSaleslistXiaoshou(Saleslist saleslist,Integer memberid) throws Exception{

        Purchaseunit pur = new Purchaseunit();
        pur.setMembershipid(memberid);
        pur.setPurchaseunitid(saleslist.getPurchaseunitid());
        int num = purchaseunitService.updateByPrimaryKeySelective(pur);

        Saleslist sal = new Saleslist();
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setNotes(saleslist.getNotes());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState("3"));
        sal.setOrderstatus2("3");
        int num2 = saleslistService.updateByPrimaryKeySelective(sal);
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num>0 && num2>0){
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



    //管理中
    @RequestMapping(value = "/saleslistxiaoshouManager.action")
    public ModelAndView saleslistxiaoshouManager()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("orderstatus2","3");
        mv.setViewName("saleslist/saleslistxiaoshouManager");
        return mv;
    }

    //已完成
    @RequestMapping(value = "/saleslistxiaoshouComplete.action")
    public ModelAndView saleslistxiaoshouComplete()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("saleslist/saleslistxiaoshouComplete");
        return mv;
    }
    /*提交销售清单部分---------结束*/

    /*签核销售清单---------开始*/
    @RequestMapping(value = "/checkSaleslist.action")
    public ModelAndView checkSaleslist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("checkSaleslist/checkSaleslist");
        return mv;
    }

    @RequestMapping(value = "/selectCheckAllSaleslist.action")
    @ResponseBody
    public DataGrid<Saleslist> selectCheckAllSaleslist(Saleslist saleslist, Integer page, Integer rows) throws Exception{
        List<Saleslist> saleslists = saleslistService.selectAllCheckSaleslist(saleslist,(page-1)*rows,rows);
        Integer total = saleslistService.totalCheckSaleslist(saleslist);
        DataGrid<Saleslist> dataGrid = new DataGrid<Saleslist>();
        dataGrid.setRows(saleslists);
        dataGrid.setTotal(new Long(total));
        return dataGrid;
    }

    @RequestMapping(value = "/updateAllCheckSaleslist.action")
    @ResponseBody
    public String updateAllCheckSaleslist(Saleslist saleslist) throws Exception{

        Saleslist sal = new Saleslist();
        sal.setOrderstatus2(saleslist.getOrderstatus2());
        sal.setSaleslistid(saleslist.getSaleslistid());
        sal.setOrderstatus1(Shenpizhuangtai.approvalState(saleslist.getOrderstatus2()));
        sal.setActualpaymentcapital(saleslist.getActualpaymentcapital());

        int num2 = saleslistService.updateByPrimaryKeySelective(sal);
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        if(num2>0){
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

    /*签核销售清单---------结束*/

    //曹成成
    @RequestMapping(value = "selectAllSaleList.action")
    @ResponseBody
    public List<Saleslist> selectAllSaleList()throws Exception{
        SaleslistExample saleslistExample = new SaleslistExample();
        SaleslistExample.Criteria saleslistExampleCriteria = saleslistExample.createCriteria();
        List<Saleslist> saleslists = saleslistService.selectByExample(saleslistExample);
        return saleslists;
    }

}
