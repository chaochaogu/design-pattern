package com.chaochaogu.design.extend.newpattern.specification.common;

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
        // 待分析的对象
        List<Object> list = new ArrayList<Object>();
        // 定义两个业务规格书
        ISpecification spec1 = new BizSpecification(new Object());
        ISpecification spec2 = new BizSpecification(new Object());
        // 规则的调用
        for (Object obj : list) {
            // and操作
            if (spec1.and(spec2).isSatisfiedBy(obj)) {
                System.out.println(obj);
            }
        }
    }
}
