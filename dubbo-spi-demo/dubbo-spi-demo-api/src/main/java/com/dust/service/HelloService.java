package com.dust.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;



/**
 * @author DUST
 * @description
 * @date 2022/2/15
 */
@SPI("dog")
public interface HelloService {

    String  sayHello();

    @Adaptive
    String  sayHello(URL url);

}
