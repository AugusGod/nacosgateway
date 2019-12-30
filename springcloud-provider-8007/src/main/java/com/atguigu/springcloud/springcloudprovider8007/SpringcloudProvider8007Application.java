package com.atguigu.springcloud.springcloudprovider8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProvider8007Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider8007Application.class, args);
    }

}
