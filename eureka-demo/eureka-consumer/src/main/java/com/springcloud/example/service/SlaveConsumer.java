package com.springcloud.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nicholas.chi on 2018/2/1.
 */
@Primary
@FeignClient(name = "service-provider",fallback = SlaveConsumerFallback.class)
public interface SlaveConsumer {
    @RequestMapping(value = "/index")
    String index();
}
