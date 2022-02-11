package com.tct.tianshu.cloud.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 9:51
 * @Version 1.0
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderApplication.class, args);
    }

}
