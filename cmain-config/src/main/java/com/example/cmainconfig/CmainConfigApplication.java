package com.example.cmainconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
* Description
* @param
* @Author junwei
* @Date 21:08 2021/2/21
**/
@SpringBootApplication
@EnableConfigServer
public class CmainConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmainConfigApplication.class, args);
    }

}
