package com.chaochaogu.design.pattern.visitor.example.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Client {
    public static void main(String[] args) {
        for (AbstractEmployee employee : mockEmployee()) {
            employee.report();
        }
    }

    public static List<AbstractEmployee> mockEmployee() {
        List<AbstractEmployee> empList = new ArrayList<>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setGender(AbstractEmployee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setGender(AbstractEmployee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setGender(AbstractEmployee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
