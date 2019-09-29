package com.zs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company
 * @Author Zs
 *      @EnableEurekaServer：表示这是一个eureka服务器
 * @Date Create in 2019/9/28
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7081.class, args);
    }
}
