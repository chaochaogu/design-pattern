package com.chaochaogu.design.mix.observer.mediator;

/**
 * 平民
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class Civilian extends EventCustomer {

    /**
     * 平民可以创建
     */
    public Civilian() {
        super(EventCustomType.NEW);
    }

    @Override
    public void execute(ProductEvent event) {
        // 事件的源头
        Product p = event.getSource();
        // 事件类型
        ProductEventType type = event.getType();
        System.out.println("平民处理事件:" + p.getName() + "诞生记,事件类型=" + type);
    }
}
