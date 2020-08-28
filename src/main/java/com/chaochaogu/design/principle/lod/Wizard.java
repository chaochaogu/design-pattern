package com.chaochaogu.design.principle.lod;

import java.util.Random;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Wizard {
    private Random random = new Random(System.currentTimeMillis());

    private int first(){
        System.out.println("执行第一个方法");
        return random.nextInt(100);
    }
    private int second(){
        System.out.println("执行第二个方法");
        return random.nextInt(100);
    }
    private int third(){
        System.out.println("执行第三个方法");
        return random.nextInt(100);
    }

    /**
     * 软件安装过程
     */
    public void installWizard(){
        int first = first();
        // 根据first返回的结果，看是否需要执行second
        if(first > 50){
            int second = second();
            if(second > 50){
                int third = third();
                if(third > 50){
                    first();
                }
            }
        }
    }
}
