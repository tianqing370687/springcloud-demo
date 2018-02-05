package com.springcloud.example.controller;

import com.springcloud.example.service.SlaveConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nicholas.chi on 2018/2/1.
 */
@RestController
public class TestController {

    @Autowired
    private SlaveConsumer slaveConsumer;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        String result = slaveConsumer.index();
        System.out.println("result : " + result);
        return "hello world";
    }



}
