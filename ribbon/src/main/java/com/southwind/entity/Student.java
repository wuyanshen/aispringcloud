package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuyanshen
 * @date 2020-02-05 2:40 下午
 * @discription Student类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;
    private String name;
    private int age;

}
