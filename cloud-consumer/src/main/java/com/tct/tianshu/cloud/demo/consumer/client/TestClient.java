package com.tct.tianshu.cloud.demo.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 9:51
 * @Version 1.0
 * @description
 */
@FeignClient(name = "cloud-provider")
public interface TestClient {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello-timeout", method = RequestMethod.GET)
    String helloTimeout();

    @RequestMapping(value = "/hello-exception", method = RequestMethod.GET)
    String helloException();
}
