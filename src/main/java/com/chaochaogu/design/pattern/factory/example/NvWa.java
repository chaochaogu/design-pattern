package com.chaochaogu.design.pattern.factory.example;

/**
 * 女娲造人
 *
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class NvWa {
    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory humanFactory = new HumanFactory();
        // 女娲第一次造人，火候不够，造出了白种人
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 女娲第二次造人，火候太足，造出了黑人
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 女娲第三次造人，火候刚刚好，造出了黄种人
        YellowHuamn yellowHuamn = humanFactory.createHuman(YellowHuamn.class);
        yellowHuamn.getColor();
        yellowHuamn.talk();
    }
}
