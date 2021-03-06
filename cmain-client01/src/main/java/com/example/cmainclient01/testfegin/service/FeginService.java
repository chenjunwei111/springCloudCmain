package com.example.cmainclient01.testfegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("client-02")
public interface FeginService {

    @RequestMapping("get02")
    public String getClient02();

}
