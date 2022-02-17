package com.dust;


import com.dust.service.HelloService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.Future;


public class XMLConsumerMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext   app  = new ClassPathXmlApplicationContext("consumer.xml");
        HelloService  service = app.getBean(HelloService.class);
        while (true) {
            System.in.read();
            try {
                String hello = service.sayHello("world", 300);
                // 利用Future 模式来获取
                Future<Object>  future  = RpcContext.getContext().getFuture();
                System.out.println("result :" + hello);
                System.out.println("future result:"+future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
