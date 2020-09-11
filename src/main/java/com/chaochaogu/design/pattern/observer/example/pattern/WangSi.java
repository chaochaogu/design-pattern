package com.chaochaogu.design.pattern.observer.example.pattern;

/**
 * 王斯（杜撰出来的观察者）
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class WangSi implements Observer {

    /**
     * 王斯，看到韩非子有活动
     *
     * @param str
     */
    @Override
    public void update(String str) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(str);
        System.out.println("王斯：哭死了...\n");
    }

    /**
     * 一看韩非子有活动，他就痛哭
     *
     * @param context
     */
    private void cry(String context) {
        System.out.println("王斯：因为" + context + "，--所以我悲伤呀！");
    }

}
