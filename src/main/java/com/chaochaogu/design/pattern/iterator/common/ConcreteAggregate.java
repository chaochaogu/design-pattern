package com.chaochaogu.design.pattern.iterator.common;

import java.util.Vector;

/**
 * 具体容器
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class ConcreteAggregate implements Aggregate {
    /**
     * 容纳对象的容器
     */
    private Vector vector = new Vector();

    public ConcreteAggregate() {
    }

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
