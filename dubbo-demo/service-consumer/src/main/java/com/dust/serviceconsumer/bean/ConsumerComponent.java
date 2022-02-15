package com.dust.serviceconsumer.bean;

import com.dust.serviceapi.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author DUST
 * @description
 * @date 2022/2/14
 */
@Component
public class ConsumerComponent {

    @Reference
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
