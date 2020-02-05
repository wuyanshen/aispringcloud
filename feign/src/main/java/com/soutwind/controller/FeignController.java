package com.soutwind.controller;

import com.soutwind.entity.Student;
import com.soutwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author wuyanshen
 * @date 2020-02-05 5:45 下午
 * @discription 控制器
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("index")
    public String index(){
        return feignProviderClient.index();
    }
}
