package com.chaochaogu.design.mix.observer.mediator;

/**
 * 贵族
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class Noble extends EventCustomer {

    /**
     * 贵族可以修改和克隆
     */
    public Noble() {
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }

    @Override
    public void execute(ProductEvent event) {
        // 事件的源头
        Product p = event.getSource();
        // 事件类型
        ProductEventType type = event.getType();
        if (type.getValue() == EventCustomType.CLONE.getValue()) {
            System.out.println("贵族处理事件:" + p.getName() + "克隆,事件类型=" + type);
        } else {
            System.out.println("贵族处理事件:" + p.getName() + "修改,事件类型=" + type);
        }
    }
}
