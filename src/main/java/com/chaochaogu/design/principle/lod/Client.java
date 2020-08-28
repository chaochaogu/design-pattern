package com.chaochaogu.design.principle.lod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 迪米特法则（Law of Demeter）
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Client {
    public static void main(String[] args) {
        List<Girl> girls = Lists.newArrayListWithCapacity(20);
        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girls));
    }
}
