package com.chaochaogu.design.pattern.visitor.example.pattern;

import lombok.Data;

/**
 * 普通员工
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class CommonEmployee extends AbstractEmployee {

    /**
     * 工作内容，Lombok，setter、getter
     */
    private String job;

    /**
     * 我允许普通员工访问
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
