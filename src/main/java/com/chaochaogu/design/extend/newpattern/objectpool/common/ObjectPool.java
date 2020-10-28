package com.chaochaogu.design.extend.newpattern.objectpool.common;

import java.util.Hashtable;

/**
 * 对象池示例代码
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public abstract class ObjectPool<T> {

    /**
     * 容器，容纳对象
     */
    private Hashtable<T, ObjectStatus> pool = new Hashtable<>();

    /**
     * 初始化时创建对象，并放入池中
     */
    public ObjectPool() {
        pool.put(create(), new ObjectStatus());
    }

    /**
     * 从HashTable中取出空闲元素
     *
     * @return
     */
    public synchronized T checkout() {
        // 最简单的策略
        for (T t : pool.keySet()) {
            if (pool.get(t).validate()) {
                pool.get(t).setUsing();
                return t;
            }
        }
        return null;
    }

    /**
     * 归还对象
     *
     * @param t
     */
    public synchronized void checkin(T t) {
        pool.get(t).setFree();
    }

    class ObjectStatus {

        /**
         * 占用
         */
        public void setUsing() {
        }

        /**
         * 释放
         */
        public void setFree() {
            // 注意，若T是有状态，则需要回归到初始化状态
        }

        /**
         * 检查是否可用
         *
         * @return
         */
        public boolean validate() {
            return false;
        }
    }

    /**
     * 创建池化对象
     *
     * @return
     */
    public abstract T create();
}
