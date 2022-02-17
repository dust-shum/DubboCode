package com.dust;

import com.dust.router.ReadyRestartInstances;

public class ServerRestartMain {
    public static void main(String[] args) throws  Exception {
        //ReadyRestartInstances.create().addRestartingInstance("service-provider","172.16.118.147");
        ReadyRestartInstances.create().removeRestartingInstance("service-provider","172.16.118.147");
    }
}
