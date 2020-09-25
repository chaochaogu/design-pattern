package com.chaochaogu.design.pattern.flyweight.example;

import lombok.Data;

/**
 * 带对象池的报考信息
 *
 * @author chaochao Gu
 * @date 2020/9/25
 */
@Data
public class SignInfo4Pool extends SignInfo {

    /**
     * 定义一个对象池提取的KEY值
     */
    private String key;

    /**
     * 构造函数获得相同标志
     *
     * @param key
     */
    public SignInfo4Pool(String key) {
        this.key = key;
    }
}
