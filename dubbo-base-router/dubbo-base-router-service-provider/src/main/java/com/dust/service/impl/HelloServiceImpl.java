package com.dust.service.impl;

import com.dust.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name, int timeToWait) {
        return "hello local:"+name;
    }
}
