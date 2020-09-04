package com.chaochaogu.design.pattern.prototype.common;

/**
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class PrototypeClass implements Cloneable {

    @Override
    protected PrototypeClass clone() {
        PrototypeClass proCls = null;
        try {
            proCls = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            // handle exception
        }
        return proCls;
    }
}
