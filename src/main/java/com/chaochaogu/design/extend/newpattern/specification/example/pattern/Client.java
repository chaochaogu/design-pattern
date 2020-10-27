package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class Client {
    public static void main(String[] args) {
        // 首先初始化一批用户
        List<User> userList = new ArrayList<User>();
        userList.add(new User("苏大", 3));
        userList.add(new User("牛二", 8));
        userList.add(new User("张三", 10));
        userList.add(new User("李四", 15));
        userList.add(new User("王五", 18));
        userList.add(new User("赵六", 20));
        userList.add(new User("马七", 25));
        userList.add(new User("杨八", 30));
        userList.add(new User("侯九", 35));
        userList.add(new User("布十", 40));
        // 定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);
        // 构建三种规格书
        IUserSpecification usernameEqualSpec = new UsernameEqualSpec("马七");
        IUserSpecification usernameLikeSpec = new UsernameLikeSpec("三");
        IUserSpecification ageGreaterThanSpec = new AgeGreaterThanSpec(20);
        // 构建组合规格书
        IUserSpecification compose = new AndSpecification(usernameEqualSpec, ageGreaterThanSpec);
        System.out.println(userProvider.findUser(usernameLikeSpec));
        System.out.println(userProvider.findUser(compose));
    }
}
