package com.chaochaogu.design.extend.newpattern.specification.example.normal;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户类
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
@Data
@AllArgsConstructor
public class User {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;
}
