package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.myrule
 * @ClassName: MySelfRule
 * @Author: 吴超
 * @Description: ${description}
 * @Date: 2020/3/7 22:49
 * @Version: 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 定义为随机
        return new RoundRobinRule();
    }
}