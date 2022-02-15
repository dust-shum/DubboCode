package com.dust.serviceconsumer;

import com.dust.serviceconsumer.bean.ConsumerComponent;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author DUST
 * @description 启动类
 * @date 2022/2/14
 */
public class AnnotationConsumerMain {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerComponent service = context.getBean(ConsumerComponent.class);
        while(true){
            System.in.read();
            String hello = service.sayHello("world");
            System.out.println("result:"+hello);
        }
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.dust.serviceconsumer")
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(value = {"com.dust.serviceconsumer.bean"})
    public static class ConsumerConfiguration{

    }
}
