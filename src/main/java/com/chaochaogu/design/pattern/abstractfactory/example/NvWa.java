package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * 女娲重造人类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class NvWa {
    public static void main(String[] args) {
        // 第一条生产线，男性生产线
        AbstractHumanFactory maleFactory = new MaleFactory();
        // 第二条生产线，女性生产线
        AbstractHumanFactory femaleFactory = new FemaleFactory();
        // 生产线建立完毕，开始生产人了
        Human maleFactoryWhiteHuman = maleFactory.createWhiteHuman();
        maleFactoryWhiteHuman.getColor();
        maleFactoryWhiteHuman.getGender();
        maleFactoryWhiteHuman.talk();
        Human maleFactoryBlackHuman = maleFactory.createBlackHuman();
        maleFactoryBlackHuman.getColor();
        maleFactoryBlackHuman.getGender();
        maleFactoryBlackHuman.talk();
        Human maleFactoryYellowHuman = maleFactory.createYellowHuman();
        maleFactoryYellowHuman.getColor();
        maleFactoryYellowHuman.getGender();
        maleFactoryYellowHuman.talk();
        Human femaleFactoryWhiteHuman = femaleFactory.createWhiteHuman();
        femaleFactoryWhiteHuman.getColor();
        femaleFactoryWhiteHuman.getGender();
        femaleFactoryWhiteHuman.talk();
        Human femaleFactoryBlackHuman = femaleFactory.createBlackHuman();
        femaleFactoryBlackHuman.getColor();
        femaleFactoryBlackHuman.getGender();
        femaleFactoryBlackHuman.talk();
        Human femaleFactoryYellowHuman = femaleFactory.createYellowHuman();
        femaleFactoryYellowHuman.getColor();
        femaleFactoryYellowHuman.getGender();
        femaleFactoryYellowHuman.talk();
    }
}
