package com.mxmvc.controller;

import com.mxmvc.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by menxu on 18/5/31.
 */
@Controller
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProductService;

    @RequestMapping(value = "/sendmessage", method = RequestMethod.GET)
    public String sendMessage(String msg) {
        String topic = "test-topic";
        String value = msg;
        String ifPartition = "0";
        Integer partitionNum = 3;
        String role = "test";//用来生成key
        Map<String,Object> res = kafkaProductService.sndMesForTemplate(topic, value, ifPartition, partitionNum, role);
        System.out.println("测试结果如下：===============");
        String message = (String)res.get("message");
        String code = (String)res.get("code");

        System.out.println("code:"+code);
        System.out.println("message:"+message);
        return "OK";
    }
}
