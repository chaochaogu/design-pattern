package com.chaochaogu.design.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class UFather {
    public Collection doSomething(Map map){
        System.out.println("你父亲做事");
        return map.values();
    }
}
