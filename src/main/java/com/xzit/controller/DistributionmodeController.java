package com.xzit.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Distributionmode;
import com.xzit.entity.DistributionmodeExample;
import com.xzit.service.DistributionmodeService;
import com.xzit.until.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuyanyan on 2018/1/11.
 */
@Controller
public class DistributionmodeController {
    @Autowired
    private DistributionmodeService distributionmodeService;

    @RequestMapping(value = "/distributionmode.action")
    public ModelAndView saleslist()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("distributionmode/distributionmode");
        return mv;
    }

    @RequestMapping(value = "selectDistributionmode.action")
    @ResponseBody
    public DataGrid<Distributionmode> selectDistributionmode(Distributionmode dis, Integer page, Integer rows) throws Exception{

        DistributionmodeExample distributionmodeExample= new DistributionmodeExample();
        DistributionmodeExample.Criteria distributionmodeExampleCriteria = distributionmodeExample.createCriteria();
        distributionmodeExampleCriteria.andNameLike("%"+dis.getName()+"%");

        PageInfo<Distributionmode> pageInfo = distributionmodeService.selectByExample(distributionmodeExample,page,rows);
        DataGrid<Distributionmode> dataGrid = new DataGrid<Distributionmode>();
        dataGrid.setTotal(pageInfo.getTotal());
        dataGrid.setRows(pageInfo.getList());
        return dataGrid;

    }


    //删除
    @RequestMapping(value = "deleteDistributionmode.action")
    @ResponseBody
    public String  deleteDistributionmode(int distributionmodeid) throws Exception{
            String msg="删除失败！";
            if (distributionmodeService.deleteDistributionmodeid(distributionmodeid)==1){
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

    //插入
    @RequestMapping(value = "insertDistributionmode.action")
    @ResponseBody
    public String insertDistributionmode(Distributionmode distributionmode)throws Exception{
        String msg="异常";
        int state=0;
        if (distributionmode.getDistributionmodeid()!=null){
            state = distributionmodeService.updateByPrimaryKeySelective(distributionmode);
            if (state==0) msg = "更新失败！请查看编号是否重复";
            else msg="更新成功";
        }else {
            state = distributionmodeService.insertSelective(distributionmode);
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
