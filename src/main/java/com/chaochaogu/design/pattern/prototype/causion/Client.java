package com.chaochaogu.design.pattern.prototype.causion;

/**
 * 注意事项：构造函数不会被执行，浅拷贝和深拷贝
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setList("QQ");
        Thing cloneThing = thing.clone();
        cloneThing.setList("GG");
        System.out.println(thing.getList());
    }
}
