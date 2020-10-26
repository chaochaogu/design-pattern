package com.chaochaogu.design.mix.observer.mediator;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 事件的观察者
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class EventDispatch implements Observer {

    /**
     * 单例模式
     */
    private static final EventDispatch DISPATCH = new EventDispatch();

    /**
     * 事件消费者
     */
    private Vector<EventCustomer> customers = new Vector<>();

    /**
     * 不允许生成新的实例
     */
    private EventDispatch() {
    }

    /**
     * 获得单例对象
     *
     * @return
     */
    public static EventDispatch getDispatch() {
        return DISPATCH;
    }

    /**
     * 事件触发
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        // 事件的源头
        Product p = (Product) arg;
        // 事件
        ProductEvent event = (ProductEvent) o;
        // 处理者处理，这里是中介者模式的核心，可以是很复杂的业务逻辑
        for (EventCustomer customer : customers) {
            // 处理能力是否匹配
            for (EventCustomType eventCustomType : customer.getCustomTypes()) {
                if (eventCustomType.getValue() == event.getType().getValue()) {
                    customer.execute(event);
                }
            }
        }
    }

    /**
     * 注册事件处理者
     *
     * @param customer
     */
    public void registerEventCustomer(EventCustomer customer) {
        customers.add(customer);
    }
}
