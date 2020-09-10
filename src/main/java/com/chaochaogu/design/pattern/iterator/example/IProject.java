package com.chaochaogu.design.pattern.iterator.example;

/**
 * 项目信息接口
 *
 * @author chaochao Gu
 * @date 2020/9/9
 */
public interface IProject {

    /**
     * 增加项目
     *
     * @param name
     * @param num
     * @param cost
     */
    public void add(String name, int num, int cost);

    /**
     * 获得项目信息
     *
     * @return
     */
    public String getProjectInfo();

    /**
     * 获得一个可以被遍历的对象
     *
     * @return
     */
    public IProjectIterator iterator();
}
