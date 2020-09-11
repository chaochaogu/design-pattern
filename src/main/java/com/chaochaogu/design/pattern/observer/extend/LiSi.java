package com.chaochaogu.design.pattern.observer.extend;

import java.util.Observable;
import java.util.Observer;

/**
 * 优化后的观察者（引用Java自带Observer）
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class LiSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕...\n");
    }

    /**
     * 汇报给秦始皇
     *
     * @param reportContext
     */
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了-->" + reportContext);
    }
}
