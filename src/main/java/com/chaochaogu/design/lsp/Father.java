package com.chaochaogu.design.lsp;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父亲做事");
        return map.values();
    }
}
