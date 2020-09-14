package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

import lombok.Data;

/**
 * 管理阶层
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class Manager extends AbstractEmployee {

    /**
     * 业绩，Lombok，setter、getter
     */
    private String performance;

    /**
     * 部门经理允许访问者访问
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
