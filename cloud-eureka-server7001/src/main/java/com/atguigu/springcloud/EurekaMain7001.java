package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: EurekaMain7001
 * @Author: 吴超
 * @Description: ${description}
 * @Date: 2020/3/7 21:56
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
    
        SpringApplication.run(EurekaMain7001.class);
    }
}
