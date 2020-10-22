package com.chaochaogu.design.pk.cross.strategyvsbridge.strategy;

/**
 * 邮件服务器
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class MailServer {

    private MailTemplate mail;

    public MailServer(MailTemplate mail) {
        this.mail = mail;
    }

    /**
     * 发送邮件
     */
    public void sendMail() {
        System.out.println("====正在发送的邮件信息====");
        //发件人
        System.out.println("发件人：" + mail.getFrom());
        //收件人
        System.out.println("收件人：" + mail.getTo());
        //标题
        System.out.println("邮件标题：" + mail.getSubject());
        //邮件内容
        System.out.println("邮件内容：" + mail.getContext());
    }
}
