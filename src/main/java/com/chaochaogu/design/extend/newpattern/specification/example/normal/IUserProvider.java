package com.chaochaogu.design.extend.newpattern.specification.example.normal;

import java.util.List;

/**
 * 用户操作对象接口
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public interface IUserProvider {

    /**
     * 根据用户名查找用户
     *
     * @param name
     * @return
     */
    public List<User> findUserByNameEqual(String name);

    /**
     * 年龄大于指定年龄的用户
     *
     * @param age
     * @return
     */
    public List<User> findUserByAgeThan(int age);
}
