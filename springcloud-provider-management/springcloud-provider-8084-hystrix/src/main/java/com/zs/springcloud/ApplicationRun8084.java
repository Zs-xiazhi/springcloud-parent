package com.zs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company
 * @Author Zs
 *      @EnableCircuitBreaker:启动断路器
 * @Date Create in 2019/9/29
 **/
@SpringBootApplication
@MapperScan("com.zs.springcloud.mapper")
@EnableCircuitBreaker
@EnableDiscoveryClient
public class ApplicationRun8084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }
}
