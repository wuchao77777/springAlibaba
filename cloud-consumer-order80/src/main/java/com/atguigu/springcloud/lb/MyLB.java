package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.lb
 * @ClassName: MyLB
 * @Author: 吴超
 * @Description: ${description}
 * @Date: 2020/3/8 14:31
 * @Version: 1.0
 */
@Component
public class MyLB implements  LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            // 超过最大值,为0,重新计数 2147483647 Integer.MAX_VALUE
            next = current >= 2147483647 ? 0 : current + 1;
            // 自旋锁
        } while (!atomicInteger.compareAndSet(current, next));
        System.out.println("****第几次访问,次数next:" + next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
       int index=getAndIncrement()% serviceInstances.size();
     return serviceInstances.get(index);
    }
}
