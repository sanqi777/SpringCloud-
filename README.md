# SpringCloud——笔记
```
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 三七 on 2020/8/9.
 */
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private  final int incrementAndGet(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next: "+next);
        return next;
    }

    //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标，每次服务启动后rest接口计数从1开始
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index =incrementAndGet() % serviceInstances.size();
        return serviceInstances.get(index);
    }

}
```
