package com.chaochaogu.design.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Son extends Father {
    /**
     * 此处为方法重载
     * @param map
     * @return
     */
    public Collection doSomething(Map map) {
        System.out.println("儿子做事");
        return map.values();
    }
}
