package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.lb
 * @ClassName: LoadBalancer
 * @Author: 吴超
 * @Description: ${description}
 * @Date: 2020/3/8 14:27
 * @Version: 1.0
 */

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
