package com.chaochaogu.design.principle.iip;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public abstract class AbstractSearcher {
    protected IGoodBodyGirl gbg;
    protected IGreatTemperamentGirl gtg;
    protected IPerfectGirl pg;
    AbstractSearcher(IGoodBodyGirl gbg){
        this.gbg = gbg;
    }
    AbstractSearcher(IGreatTemperamentGirl gtg){
        this.gtg = gtg;
    }
    AbstractSearcher(IPerfectGirl pg){
        this.pg = pg;
    }
    abstract void show();
}
