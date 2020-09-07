package com.chaochaogu.design.pattern.decorator.common;

/**
 * 抽象装饰者
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class AbstractDecorator extends AbstractComponent {
    private AbstractComponent component;

    /**
     * 通过构造函数传递被修饰者
     *
     * @param component
     */
    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    /**
     * 委托给被修饰者执行
     */
    @Override
    public void operate() {
        component.operate();
    }
}
