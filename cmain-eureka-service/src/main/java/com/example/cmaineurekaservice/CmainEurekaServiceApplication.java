package com.example.cmaineurekaservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class CmainEurekaServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(CmainEurekaServiceApplication.class, args);
    }

}
