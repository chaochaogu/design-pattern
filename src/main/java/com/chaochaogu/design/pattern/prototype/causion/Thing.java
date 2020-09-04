package com.chaochaogu.design.pattern.prototype.causion;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Thing implements Cloneable {
    private ArrayList<String> list = Lists.newArrayList();

    public Thing() {
        System.out.println("构造函数被调用了");
    }

    public void setList(String str) {
        this.list.add(str);
    }

    public List<String> getList() {
        return this.list;
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            // 深拷贝
//             thing.list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            // handle exception
        }
        return thing;
    }
}
