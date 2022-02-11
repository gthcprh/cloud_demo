package com.tct.tianshu.cloud.demo.consumer.client;

/**
 * @Author: Hannibal
 * @Date: 2022/2/11 10:10
 * @Version 1.0
 * @description
 */
public class TestClientFallback implements TestClient{
    @Override
    public String hello() {
        return null;
    }

    @Override
    public String helloTimeout() {
        return "超时备用方法";
    }

    @Override
    public String helloException() {
        return "抛异常备用方法";
    }
}
