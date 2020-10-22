package com.chaochaogu.design.pk.cross.strategyvsbridge.bridge;

/**
 * Postfix邮件服务器
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Postfix extends MailServer {

    public Postfix(MailTemplate mail) {
        super(mail);
    }

    /**
     * 修正邮件发送程序
     */
    @Override
    public void sendMail() {
        // 增加邮件服务器信息
        String context = "Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n";
        super.mail.add(context);
        super.sendMail();
    }
}
