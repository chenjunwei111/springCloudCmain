package com.example.cmainclient01.testfegin.controller;

import com.example.cmainclient01.testfegin.service.FeginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestFeginController {

    @Resource
    FeginService service;

    @RequestMapping("c1getc2")
    public String c1getc2(){
       return service.getClient02();
    }

}
