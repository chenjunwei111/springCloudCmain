package com.example.cmainclient02.ctest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Description
* @param
* @Author junwei
* @Date 19:44 2021/2/21
**/
@RestController
public class Client02Controller {

    final Logger logger = LoggerFactory.getLogger(Client02Controller.class);
    //    http://localhost:8885/get02
    @RequestMapping("get02")
    public String getClient02Msg(String s2){
        logger.error("this is client02 "+s2);
        return "this is a client02 service";
    }

}
