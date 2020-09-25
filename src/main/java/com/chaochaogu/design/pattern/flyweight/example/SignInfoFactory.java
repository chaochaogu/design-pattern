package com.chaochaogu.design.pattern.flyweight.example;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * 报考信息工厂，带对象池的工厂类
 *
 * @author chaochao Gu
 * @date 2020/9/25
 */
public class SignInfoFactory {

    /**
     * 池容器
     */
    private static HashMap<String, SignInfo> pool = Maps.newHashMap();

    @Deprecated
    public static SignInfo signInfo() {
        return new SignInfo();
    }

    /**
     * 从池中获得对象
     *
     * @param key
     * @return
     */
    public static SignInfo getSignInfo(String key) {
        // 设置返回对象
        SignInfo signInfo;
        if (!pool.containsKey(key)) {
            // 池中没有该对象，则建立，并放入池中
            System.out.println(key + "----建立对象，并放置到池中");
            signInfo = new SignInfo4Pool(key);
            pool.put(key, signInfo);
        } else {
            signInfo = pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }
        return signInfo;
    }
}
