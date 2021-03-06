package com.example.cmainclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


//  启动类
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class CmainClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(CmainClient01Application.class, args);
    }

}
