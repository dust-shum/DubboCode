package com.dust.serviceprovider.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * @author DUST
 * @description 过滤器
 * @date 2022/2/15
 */
@Activate(group = {CommonConstants.CONSUMER,CommonConstants.PROVIDER})
public class DubboInvokeFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long   startTime  = System.currentTimeMillis();
        try {
            // 执行方法
            return  invoker.invoke(invocation);
        } finally {
            System.out.println("invoke time:"+(System.currentTimeMillis()-startTime) + "毫秒");
        }
    }

}
