package com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator;

/**
 * 外形美化
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class BeautifulAppearance extends Decorator {

    /**
     * 要美化谁
     *
     * @param swan
     */
    public BeautifulAppearance(Swan swan) {
        super(swan);
    }

    /**
     * 外表美化处理
     */
    @Override
    public void show() {
        System.out.println("外表是纯白色的，非常惹人喜爱！");
    }
}
