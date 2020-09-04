package com.chaochaogu.design.pattern.prototype.example;

import lombok.Data;

/**
 * 邮件
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
@Data
public class Mail implements Cloneable {

    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String context;
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 称谓
     */
    private String appellation;
    /**
     * 邮件的尾部，一般都是加上"XXX版权所有"等信息
     */
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            // handle exception
        }
        return mail;
    }
}
