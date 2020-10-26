package com.chaochaogu.design.mix.observer.mediator;

/**
 * 乞丐
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class Beggar extends EventCustomer {

    /**
     * 只能处理被人遗弃的东西
     */
    public Beggar() {
        super(EventCustomType.DELETE);
    }

    @Override
    public void execute(ProductEvent event) {
        // 事件的源头
        Product p = event.getSource();
        // 事件类型
        ProductEventType type = event.getType();
        System.out.println("乞丐处理事件:" + p.getName() + "销毁,事件类型=" + type);
    }
}
