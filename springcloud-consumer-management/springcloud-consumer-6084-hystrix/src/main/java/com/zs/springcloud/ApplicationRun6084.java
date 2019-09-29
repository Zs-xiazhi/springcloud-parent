package com.zs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/29
 **/
@SpringBootApplication
@EnableFeignClients
public class ApplicationRun6084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6084.class, args);
    }
}
