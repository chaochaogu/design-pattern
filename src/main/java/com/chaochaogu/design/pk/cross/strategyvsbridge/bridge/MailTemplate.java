package com.chaochaogu.design.pk.cross.strategyvsbridge.bridge;

import lombok.Data;

/**
 * 邮件模板
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

    /**
     * 允许增加邮件发送标志
     *
     * @param sendInfo
     */
    public void add(String sendInfo) {
        context = context + sendInfo;
    }
}
