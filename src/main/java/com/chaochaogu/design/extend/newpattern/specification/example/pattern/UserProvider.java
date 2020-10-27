package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 用户操作对象
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
    public List<User> findUser(IUserSpecification specification) {
        List<User> users = Lists.newArrayList();
        for (User user : userList) {
            if (specification.isSatisfiedBy(user)) {
                users.add(user);
            }
        }
        return users;
    }
}
