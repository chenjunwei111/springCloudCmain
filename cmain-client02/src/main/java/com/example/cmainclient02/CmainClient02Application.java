package com.example.cmainclient02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* Description 
* @param 
* @param 
* @Author junwei
* @Date 10:26 2021/2/22
**/
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class CmainClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(CmainClient02Application.class, args);
    }

}
