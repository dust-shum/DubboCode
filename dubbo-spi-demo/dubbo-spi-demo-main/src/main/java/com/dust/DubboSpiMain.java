package com.dust;

import com.dust.service.HelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

/**
 * @author DUST
 * @description
 * @date 2022/2/15
 */
public class DubboSpiMain {

    public static void main(String[] args) {
        // 获取扩展加载器
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        // 遍历所有的支持的扩展点 META-INF.dubbo
        Set<String> supportedExtensions = extensionLoader.getSupportedExtensions();
        for (String supportedExtension : supportedExtensions) {
            String result = extensionLoader.getExtension(supportedExtension).sayHello();
            System.out.println(result);
        }
    }
}
