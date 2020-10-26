package com.chaochaogu.design.mix.observer.mediator;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class Client {
    public static void main(String[] args) {
        // 获得事件分发中心
        EventDispatch dispatch = EventDispatch.getDispatch();
        // 接受乞丐对事件的处理
        dispatch.registerEventCustomer(new Beggar());
        // 接受平民对事件的处理
        dispatch.registerEventCustomer(new Civilian());
        // 接受贵族对事件的处理
        dispatch.registerEventCustomer(new Noble());
        // 建立一个原子弹生产工厂
        ProductManager factory = new ProductManager();
        // 制造一个产品
        System.out.println("=====模拟创建产品事件========");
        System.out.println("创建一个叫做小男孩的原子弹");
        Product p = factory.createProduct("小男孩原子弹");
        // 修改一个产品
        System.out.println("\n=====模拟修改产品事件========");
        System.out.println("把小男孩原子弹修改为胖大叔原子弹");
        factory.editProduct(p, "胖大叔原子弹");
        // 克隆一个产品
        System.out.println("\n=====模拟克隆产品事件========");
        System.out.println("克隆胖大叔原子弹");
        factory.clone(p);
        // 遗弃一个产品
        System.out.println("\n=====模拟销毁产品事件========");
        System.out.println("遗弃胖大叔原子弹");
        factory.abandonProduct(p);
    }
}
