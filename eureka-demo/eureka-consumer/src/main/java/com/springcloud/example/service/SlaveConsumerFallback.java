package com.springcloud.example.service;

import org.springframework.stereotype.Component;

/**
 * Created by nicholas.chi on 2018/2/1.
 */
@Component
public class SlaveConsumerFallback implements SlaveConsumer {
    @Override
    public String index() {
        return "Feign客户端访问失败";
    }
}
