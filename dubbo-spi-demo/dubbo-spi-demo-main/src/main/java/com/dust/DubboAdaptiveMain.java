package com.dust;

import com.dust.service.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author DUST
 * @description
 * @date 2022/2/15
 */
public class DubboAdaptiveMain {
    public static void main(String[] args) {
        URL url = URL.valueOf("test://localhost/hello1111?hello.service=dog");
        HelloService adaptiveExtension = ExtensionLoader.getExtensionLoader(HelloService.class).getAdaptiveExtension();
        String msg = adaptiveExtension.sayHello(url);
        System.out.println(msg);
    }
}
