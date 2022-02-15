package com.dust.serviceprovider.service.impl;

import com.dust.serviceapi.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author DUST
 * @description 业务实现类
 * @date 2022/2/14
 */
@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello: " + name;
    }
}
