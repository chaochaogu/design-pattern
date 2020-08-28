package com.chaochaogu.design.principle.iip;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Searcher extends AbstractSearcher {
    Searcher(IGoodBodyGirl gbg) {
        super(gbg);
    }
    Searcher(IGreatTemperamentGirl gtg){
        super(gtg);
    }
    Searcher(IPerfectGirl pg){
        super(pg);
    }

    @Override
    void show() {
        if(gbg != null){
            gbg.goodLooking();
            gbg.niceFigure();
        }
        if(gtg != null){
            gtg.greatTemperament();
        }
        if(pg != null){
            pg.goodLooking();
            pg.niceFigure();
            pg.greatTemperament();
        }
    }
}
