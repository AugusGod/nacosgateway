package com.atguiug.springcloud.springcloudconsumer87.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-provider")
public interface ProviderFeign {
    @RequestMapping("hello")
    public String hello();
}
