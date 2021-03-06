package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyanshen
 * @date 2020-02-06 12:34 上午
 * @discription 控制器
 */
@RestController
@RequestMapping("zipkin")
public class ZipkinController {
    @Value("${server.port}")
    private String port;

    @GetMapping("index")
    public String index(){
        return this.port;
    }
}
