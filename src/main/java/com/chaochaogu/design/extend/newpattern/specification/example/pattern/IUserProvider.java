package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

import java.util.List;

/**
 * 用户操作对象接口
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public interface IUserProvider {

    /**
     * 根据条件查找用户
     *
     * @param specification
     * @return
     */
    public List<User> findUser(IUserSpecification specification);
}
