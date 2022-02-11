package com.tct.tianshu.cloud.demo.consumer.controller;

import com.tct.tianshu.cloud.demo.consumer.client.TestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 9:51
 * @Version 1.0
 * @description
 */
@RestController
public class TestController {

    @Resource
    TestClient testClient;

    @GetMapping("/hello")
    public String hello() {
        return testClient.hello();
    }

    @GetMapping("/hello-timeout")
    public String helloTimeout() {
        return testClient.helloTimeout();
    }

    @GetMapping("/hello-exception")
    public String helloException() {

        return testClient.helloException();
    }


}
