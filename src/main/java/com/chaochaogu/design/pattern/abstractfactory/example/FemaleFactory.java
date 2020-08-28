package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * 生产女性的八卦炉
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class FemaleFactory extends AbstractHumanFactory {
    @Override
    Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
