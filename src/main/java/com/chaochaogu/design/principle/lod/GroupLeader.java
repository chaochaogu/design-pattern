package com.chaochaogu.design.principle.lod;

import java.util.List;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class GroupLeader {
    private List<Girl> girls;
    GroupLeader(List<Girl> girls){
        this.girls = girls;
    }
    public void countGirls(){
        System.out.println("女生的数量" + girls.size());
    }
}
