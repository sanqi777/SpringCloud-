package com.san.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created by 三七 on 2020/8/9.
 */
public interface LoadBalancer {

    ServiceInstance instances( List<ServiceInstance> serviceInstances );
}
