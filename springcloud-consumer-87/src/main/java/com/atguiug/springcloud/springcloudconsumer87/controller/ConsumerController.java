package com.atguiug.springcloud.springcloudconsumer87.controller;

import com.atguiug.springcloud.springcloudconsumer87.feign.ProviderFeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ConsumerController {
    @Autowired
    private  ProviderFeign  providerFeign;

    @GetMapping(value = "hi")
    public String hi(){
        String hello = this.providerFeign.hello();
        return  hello;
    }

}
