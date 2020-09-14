package com.chaochaogu.design.pattern.visitor.example.normal;

import lombok.Data;

/**
 * 关联阶层
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class Manager extends AbstractEmployee {

    /**
     * 业绩
     */
    private String performance;

    @Override
    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }
}
