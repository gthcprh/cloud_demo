package com.tct.tianshu.cloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 9:51
 * @Version 1.0
 * @description
 */
@EnableFeignClients(basePackages = "com.tct.tianshu.cloud.demo")
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerApplication.class, args);
    }

}
