package com.chaochaogu.design.principle.iip;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class GreatTemperamentGirl implements IGreatTemperamentGirl {
    private String name;
    GreatTemperamentGirl(String name){
        this.name = name;
    }
    @Override
    public void greatTemperament() {
        System.out.println(name + "气质佳");
    }
}
