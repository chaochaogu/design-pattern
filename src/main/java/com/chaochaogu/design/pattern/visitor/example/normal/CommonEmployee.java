package com.chaochaogu.design.pattern.visitor.example.normal;

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
     * 工作内容
     */
    private String job;

    @Override
    protected String getOtherInfo() {
        return "工作：" + this.job + "\t";
    }
}
