package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * 八卦炉定义
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class AbstractHumanFactory {
    /**
     * 制造一个白色人种
     *
     * @return
     */
    abstract Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     *
     * @return
     */
    abstract Human createBlackHuman();

    /**
     * 制造一个黄色人种
     *
     * @return
     */
    abstract Human createYellowHuman();
}
