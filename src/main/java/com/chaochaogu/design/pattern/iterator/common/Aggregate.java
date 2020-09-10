package com.chaochaogu.design.pattern.iterator.common;

/**
 * 抽象容器
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public interface Aggregate {
    /**
     * 是容器必然有元素的增加
     *
     * @param object
     */
    public void add(Object object);

    /**
     * 减少元素
     *
     * @param object
     */
    public void remove(Object object);

    /**
     * 由迭代器来遍历所有的元素
     *
     * @return
     */
    public Iterator iterator();
}
