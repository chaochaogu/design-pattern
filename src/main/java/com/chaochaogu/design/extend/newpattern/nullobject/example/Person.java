package com.chaochaogu.design.extend.newpattern.nullobject.example;

/**
 * 听动物叫声的人
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Person {

    /**
     * 听动物叫声
     *
     * @param animal
     */
    public void hear(Animal animal) {
        if (animal != null) {
            animal.makeSound();
        }
    }
}
