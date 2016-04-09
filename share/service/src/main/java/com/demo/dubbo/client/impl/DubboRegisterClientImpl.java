package com.demo.dubbo.client.impl;

import cn.demo.service.dubbo.register.service.RegisterService;
import com.demo.dubbo.client.DubboRegisterClient;
import org.springframework.beans.factory.annotation.Autowired;


public class DubboRegisterClientImpl implements DubboRegisterClient {

    @Autowired
    private RegisterService registerService;

    @Override
    public String SayHello(final String name) {
        return registerService.hello(name);
    }
}
