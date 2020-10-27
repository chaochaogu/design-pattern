package com.chaochaogu.design.extend.newpattern.specification.example.normal;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 用户操作类
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class UserProvider implements IUserProvider {

    /**
     * 用户列表
     */
    private List<User> userList;

    /**
     * 构造函数传递用户列表
     *
     * @param userList
     */
    public UserProvider(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public List<User> findUserByNameEqual(String name) {
        List<User> users = Lists.newArrayList();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                users.add(user);
            }
        }
        return users;
    }

    @Override
    public List<User> findUserByAgeThan(int age) {
        List<User> users = Lists.newArrayList();
        for (User user : userList) {
            if (user.getAge() > age) {
                users.add(user);
            }
        }
        return users;
    }
}
