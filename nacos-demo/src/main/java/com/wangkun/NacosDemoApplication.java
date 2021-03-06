package com.wangkun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wangkun.mapper")
public class NacosDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDemoApplication.class,args);
    }
}
