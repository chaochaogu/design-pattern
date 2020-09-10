package com.chaochaogu.design.pattern.iterator.common;

import java.util.Vector;

/**
 * 具体迭代器
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class ConcreteIterator implements Iterator {
    private Vector vector;
    /**
     * 定义当前游标
     */
    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        return this.vector.get(this.cursor++);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < vector.size();
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
