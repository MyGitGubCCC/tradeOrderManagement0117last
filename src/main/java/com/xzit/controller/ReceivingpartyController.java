package com.xzit.controller;

import com.xzit.entity.Receivingparty;
import com.xzit.entity.ReceivingpartyExample;
import com.xzit.service.ReceivingpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by caochengcheng on 2018/1/7.
 */
@Controller
public class ReceivingpartyController {
    @Autowired
    private ReceivingpartyService receivingpartyService;
    @RequestMapping(value = "selectAllReceivingparty.action")
    @ResponseBody
    public List<Receivingparty> selectAllReceivingparty() throws Exception{
        ReceivingpartyExample receivingpartyExample= new ReceivingpartyExample();
        List<Receivingparty> receivingparties= receivingpartyService.selectByExample(receivingpartyExample);
        return receivingparties;
    }
}
