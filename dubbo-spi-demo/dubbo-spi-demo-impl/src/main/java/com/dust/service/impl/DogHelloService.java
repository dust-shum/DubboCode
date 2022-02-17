package com.dust.service.impl;

import com.dust.service.HelloService;
import org.apache.dubbo.common.URL;


/**
 * @author DUST
 * @description
 * @date 2022/2/15
 */
public class DogHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "wang wang wang";
    }

    @Override
    public String sayHello(URL url) {
        return "wang wang url";
    }
}
