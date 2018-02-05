package com.springcloud.example.consumer.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nicholas.chi on 2018/2/1.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "这是Service Provider";
    }

}
