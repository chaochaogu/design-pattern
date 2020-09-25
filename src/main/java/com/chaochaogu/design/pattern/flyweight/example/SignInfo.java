package com.chaochaogu.design.pattern.flyweight.example;

import lombok.Data;

/**
 * 报考信息
 *
 * @author chaochao Gu
 * @date 2020/9/25
 */
@Data
public class SignInfo {

    /**
     * 报考人员ID
     */
    private String id;
    /**
     * 考试地点
     */
    private String location;
    /**
     * 考试科目
     */
    private String subject;
    /**
     * 邮寄地址
     */
    private String postAddress;
}
