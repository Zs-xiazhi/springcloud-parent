package com.zs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company
 * @Author Zs
 *      @EnableDiscoveryClient:在eureka注册中心中注册该服务,允许eureka发现客户端
 * @Date Create in 2019/9/28
 **/
@SpringBootApplication
@MapperScan("com.zs.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }
}
