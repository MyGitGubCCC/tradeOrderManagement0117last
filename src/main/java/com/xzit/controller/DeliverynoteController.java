package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.*;
import com.xzit.service.DeliverynoteService;
import com.xzit.service.EmployeeService;
import com.xzit.service.SaleslistService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by caochengcheng on 2018/1/7.
 */
@Controller
public class DeliverynoteController {
    @Autowired
    private DeliverynoteService deliverynoteService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private SaleslistService saleslistService;

    @RequestMapping(value = "/deliverynote.action")
    public ModelAndView deliverynote()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("deliverynote/deliverynote");
        return mv;
    }
    //单表
    @RequestMapping(value = "selectAllDeliverynoteByConsignment.action")
    @ResponseBody
    public List<Deliverynote> selectAllDeliverynote()throws Exception{
        DeliverynoteExample deliverynoteExample = new DeliverynoteExample();
        DeliverynoteExample.Criteria deliverynoteExampleCriteria = deliverynoteExample.createCriteria();
        deliverynoteExampleCriteria.andPickupEqualTo("是");
        List<Deliverynote> deliverynotes = deliverynoteService.selectByExample(deliverynoteExample);
        return deliverynotes;
    }

    //多表
    @RequestMapping(value = "selectAllDeliveryNoteVo.action")
    @ResponseBody
    public DataGrid<Deliverynote> selectAllDeliveryNoteVo(String deliverynoteno, String pickup, String employeename, Integer page, Integer rows)throws Exception{
        DeliverynoteExample deliverynoteExample = new DeliverynoteExample();
        DeliverynoteExample.Criteria deliverynoteExampleCriteria = deliverynoteExample.createCriteria();
        SaleslistExample saleslistExample = new SaleslistExample();
        SaleslistExample.Criteria saleslistExampleCriteria = saleslistExample.createCriteria();
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria employeeExampleCriteria= employeeExample.createCriteria();

        //加入查询条件，送货单号和是否取货
        deliverynoteExampleCriteria.andDeliverynotenoLike("%"+deliverynoteno+"%");
        deliverynoteExampleCriteria.andPickupLike("%"+pickup+"%");

        //获取员工名称，并查询到集合中
        employeeExampleCriteria.andNameLike("%"+employeename+"%");
        List<Employee> employees = employeeService.selectByExample(employeeExample);

        List<Integer> employeeids =new ArrayList<Integer>();
        for(Employee employee:employees){
            employeeids.add(employee.getEmployeeid());
        }

        //再加入查询条件，员工id
        deliverynoteExampleCriteria.andEmployeeidIn(employeeids);

        PageInfo<Deliverynote> pageInfo = deliverynoteService.selectAllDeliveryNote(deliverynoteExample,page,rows);
        DataGrid<Deliverynote> dataGrid = new DataGrid<Deliverynote>();
        dataGrid.setTotal(pageInfo.getTotal());
        dataGrid.setRows(pageInfo.getList());
        return dataGrid;
    }

    @RequestMapping(value = "insertOrUpdateDeliveryNote.action")
    @ResponseBody
    public String insertOrUpdateDeliveryNote(Deliverynote deliverynote)throws Exception{
        String msg="异常";
        int state=0;
        if (deliverynote.getDeliverynoteid()!=null){
            state = deliverynoteService.updateByPrimaryKeySelective(deliverynote);
            if (state==0) msg = "更新失败！请查看编号是否重复";
            else msg="更新成功";
        }else {

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
            deliverynote.setDeliverynoteno("deliver"+date);
            deliverynote.setEmployeeid(1);
            deliverynote.setPickup("否");
            state = deliverynoteService.insertSelective(deliverynote);
            if (state==0) msg = "操作失败！";
            else msg="操作成功";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            msg = mapper.writeValueAsString(msg);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return msg;
    }
    @RequestMapping(value = "deleteDeliveryNote.action")
    @ResponseBody
    public String  deleteDeliveryNote(int deliverynoteid)throws Exception{
        String msg="删除失败";
        if (deliverynoteService.deleteByPrimaryKey(deliverynoteid)==1){
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

    @RequestMapping(value = "pickup.action")
    @ResponseBody
    public String  pickup(int deliverynoteid,int saleslistid)throws Exception{
        String msg="操作失败！";
        Deliverynote deliverynote = new Deliverynote();
        deliverynote.setDeliverynoteid(deliverynoteid);
        deliverynote.setPickup("是");
        Saleslist saleslist = new Saleslist();
        saleslist.setSaleslistid(saleslistid);
        saleslist.setOrderstatus2("11");
        if (deliverynoteService.updateByPrimaryKeySelective(deliverynote)==1){
            saleslistService.updateByPrimaryKeySelective(saleslist);
            msg="取货成功";
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            msg = mapper.writeValueAsString(msg);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return msg;
    }

    //曹成成
    @RequestMapping(value = "selectAllSaleListByDeliverynote.action")
    @ResponseBody
    public List<Saleslist> selectAllSaleListByDeliverynote()throws Exception{
        SaleslistExample saleslistExample = new SaleslistExample();
        SaleslistExample.Criteria saleslistExampleCriteria = saleslistExample.createCriteria();
        saleslistExampleCriteria.andOrderstatus2EqualTo("10");
        List<Saleslist> saleslists = saleslistService.selectByExample(saleslistExample);
        return saleslists;
    }
}
