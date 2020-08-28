package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * 生产男性的八卦炉
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class MaleFactory extends AbstractHumanFactory {
    @Override
    Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
