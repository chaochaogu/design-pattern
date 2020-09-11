package com.chaochaogu.design.pattern.facade.common;

/**
 * 门面对象
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Facade {

    /**
     * 被委托的对象
     */
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    private Context context = new Context();

    /**
     * 提供给外部访问的方法
     */
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.c.doSomethingC();
    }

    public void methodD() {
        this.context.complexMethod();
    }
}
