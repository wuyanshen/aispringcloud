package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author wuyanshen
 * @date 2020-02-05 5:57 下午
 * @discription 服务降级处理类
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务降级。。。";
    }
}
