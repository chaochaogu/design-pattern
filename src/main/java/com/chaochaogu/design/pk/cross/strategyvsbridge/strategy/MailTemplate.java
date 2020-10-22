package com.chaochaogu.design.pk.cross.strategyvsbridge.strategy;

import lombok.Data;

/**
 * 抽象邮件模板类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
@Data
public abstract class MailTemplate {

    /**
     * 发件人
     */
    private String from;

    /**
     * 收件人
     */
    private String to;

    /**
     * 主题
     */
    private String subject;

    /**
     * 邮件内容
     */
    private String context;

    public MailTemplate(String from, String to, String subject, String context) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.context = context;
    }
}
