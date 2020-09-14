package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

import lombok.Data;

/**
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public abstract class AbstractEmployee {
    public static final int MALE = 1;
    public static final int FEMALE = 0;

    /**
     * 姓名、性别、薪水，setter、getter通过Lombok生成
     */
    private String name;
    private int gender;
    private int salary;

    /**
     * 我允许一个访问者访问
     *
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
