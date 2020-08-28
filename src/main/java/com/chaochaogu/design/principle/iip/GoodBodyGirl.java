package com.chaochaogu.design.principle.iip;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class GoodBodyGirl implements IGoodBodyGirl {
    private String name;
    GoodBodyGirl(String name){
        this.name = name;
    }
    @Override
    public void goodLooking() {
        System.out.println(name + "长好看");
    }

    @Override
    public void niceFigure() {
        System.out.println(name + "身材好");
    }
}
