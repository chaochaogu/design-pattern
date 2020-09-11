package com.chaochaogu.design.pattern.observer.example.normal;

/**
 * 李斯
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class LiSi implements ILiSi {

    /**
     * 首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
     *
     * @param context
     */
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + context);
    }
}
