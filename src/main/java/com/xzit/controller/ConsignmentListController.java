package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.*;
import com.xzit.service.ConsignmentListService;
import com.xzit.service.EmployeeService;
import com.xzit.service.ReceivingpartyService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
@Controller
public class ConsignmentListController {
    @Autowired
    private ConsignmentListService consignmentListService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ReceivingpartyService receivingpartyService;

    @RequestMapping(value = "consignmentlist.action")
    @ResponseBody
    public ModelAndView consignmentlist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("consignment/consignmentlist");
        return mv;
    }

    @RequestMapping(value = "consignmentlist2.action")
    @ResponseBody
    public ModelAndView consignmentlist2()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("consignment/consignmentlist2");
        return mv;
    }

    @RequestMapping(value = "selectConsignment.action")
    @ResponseBody
    public DataGrid<Consignmentlist> selectConsignment(String consignmentlistno, String receivingpartyname, String employeename, Integer page, Integer rows){
        //创建一个实体example
        ConsignmentlistExample consignmentlistExample = new ConsignmentlistExample();
        ConsignmentlistExample.Criteria consignmentlistExampleCriteria = consignmentlistExample.createCriteria();
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria employeeExampleCriteria= employeeExample.createCriteria();
        ReceivingpartyExample receivingpartyExample = new ReceivingpartyExample();
        ReceivingpartyExample.Criteria receivingpartyExampleCriteria = receivingpartyExample.createCriteria();

        //获取收货方名称，并查询到集合中
        receivingpartyExampleCriteria.andReceiptnameLike("%"+receivingpartyname+"%");
        List<Receivingparty> receivingparties = receivingpartyService.selectByExample(receivingpartyExample);

        List<Integer> receivingpartyids =new ArrayList<Integer>();
        for(Receivingparty receivingparty:receivingparties){
            receivingpartyids.add(receivingparty.getReceivingpartyid());
        }

        //获取员工名称，并查询到集合中
        employeeExampleCriteria.andNameLike("%"+employeename+"%");
        List<Employee> employees = employeeService.selectByExample(employeeExample);

        List<Integer> employeeids =new ArrayList<Integer>();
        for(Employee employee:employees){
            employeeids.add(employee.getEmployeeid());
        }
        //根据收货方和员工id集合查询
        consignmentlistExampleCriteria.andReceivingpartyidIn(receivingpartyids);
        consignmentlistExampleCriteria.andEmployeeidIn(employeeids);
        //给example加条件，下面语句相当于数据库中where consignmentlistno like "%"+consignmentlistno+"%"
        consignmentlistExampleCriteria.andConsignmentlistnoLike("%"+consignmentlistno+"%");


        //查询到的内容封装成PageInfo集合
        PageInfo<Consignmentlist> pageInfo = consignmentListService.selectAllConsignmentlist(consignmentlistExample,page,rows);
        //再封装成DataGrid集合，传到jsp，easyui会自动解析，进行分页
        DataGrid<Consignmentlist> dataGrid = new DataGrid<Consignmentlist>();
        dataGrid.setTotal(pageInfo.getTotal());
        dataGrid.setRows(pageInfo.getList());
        return dataGrid;
    }

    @RequestMapping(value = "insertOrUpdateConsignmentList.action")
    @ResponseBody
    public String insertOrUpdateConsignmentList(Consignmentlist consignmentlist,String waybillnumber)throws Exception{
         String msg="异常";
         int state=0;
         if (consignmentlist.getConsignmentlistid()!=null){
             state = consignmentListService.updateByPrimaryKeySelective(consignmentlist);
             if (state==0) msg = "更新失败！请查看编号是否重复";
             else msg="更新成功";
         }else {
             /*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
             String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳*/
             long currentTime=System.currentTimeMillis();
             consignmentlist.setConsignmentlistno("cgl"+currentTime);
             String w = consignmentlist.getWaybillnumber();
             int receivingPartId = consignmentListService.selectReceivingPartyIdByWaybillNumber(w);
             consignmentlist.setReceivingpartyid(receivingPartId);
             state = consignmentListService.insertSelective(consignmentlist);
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

    @RequestMapping(value = "deleteConsignmentList.action")
    @ResponseBody
    public String  deleteConsignmentList(int consignmentlistid)throws Exception{
        String msg="删除失败！";
        if (consignmentListService.deleteByPrimaryKey(consignmentlistid)==1){
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
}
