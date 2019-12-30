package com.atguigu.springcloud.springcloudprovider8007.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ProviderController {
    @Value("${myName}")
    private String name;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${redis.url}")
    private String redisUrl;

    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        //打印端口号，查看负载均衡
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL().toString());
        return "hello———————————————————— " + name+ ", redis-url=" +redisUrl + ", jdbc-url=" +jdbcUrl;
    }
}
