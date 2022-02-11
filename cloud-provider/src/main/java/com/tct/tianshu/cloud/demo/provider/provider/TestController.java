package com.tct.tianshu.cloud.demo.provider.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 9:51
 * @Version 1.0
 * @description
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hello-timeout")
    public String helloTimeout() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello world,helloTimeout";
    }

    @GetMapping("/hello-exception")
    public String helloException() {
        List list=new ArrayList<>();
        return list.get(2).toString();
    }
}
