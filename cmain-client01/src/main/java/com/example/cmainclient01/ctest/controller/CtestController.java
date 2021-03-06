package com.example.cmainclient01.ctest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Description
* @param
* @param
* @Author junwei
* @Date 17:16 2021/2/20
**/
@RestController
public class CtestController {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

//    http://localhost:8889/get01?s1=一个elk测试
    @RequestMapping("get01")
    public String getMsg1(String s1){
        logger.info("this is Client "+s1);
        return "this is Client "+s1;
    }

}
