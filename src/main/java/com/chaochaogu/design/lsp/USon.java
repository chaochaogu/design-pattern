package com.chaochaogu.design.lsp;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class USon extends UFather {
    /**
     * 此处为方法重载
     * @param map
     * @return
     */
    public Collection doSomething(HashMap map) {
        System.out.println("你儿子做事");
        return map.values();
    }
}
