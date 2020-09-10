package com.chaochaogu.design.pattern.iterator.common;

/**
 * 抽象迭代器
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public interface Iterator {

    /**
     * 遍历到下一个元素
     *
     * @return
     */
    public Object next();

    /**
     * 是否已经遍历到尾部
     *
     * @return
     */
    public boolean hasNext();

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    public boolean remove();
}
