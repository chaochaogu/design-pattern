package com.chaochaogu.design.pk.cross.strategyvsbridge.bridge;

/**
 * SendMail邮件服务器
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class SendMail extends MailServer {

    public SendMail(MailTemplate mail) {
        super(mail);
    }

    /**
     * 修正邮件发送程序
     */
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        super.mail.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
        super.sendMail();
    }
}
