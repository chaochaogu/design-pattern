package com.chaochaogu.design.extend.newpattern.nullobject.example;

/**
 * 小狗
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("汪汪汪");
    }
}
