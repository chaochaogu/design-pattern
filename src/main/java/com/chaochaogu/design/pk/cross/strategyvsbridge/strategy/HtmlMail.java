package com.chaochaogu.design.pk.cross.strategyvsbridge.strategy;

/**
 * 超文本邮件
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {
        //超文本类型设置邮件的格式为：multipart/mixed
        String context = "\nContent-Type: multipart/mixed; charset= GB2312\n" + super.getContext();
        //同时对邮件进行HTML检查，是否有类似未关闭的标签
        context = context + "\n邮件格式为：超文本格式";
        return context;

    }
}
