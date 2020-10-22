package com.chaochaogu.design.pk.cross.strategyvsbridge.strategy;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Client {
    public static void main(String[] args) {
        // 创建一封HTML邮件
        MailTemplate htmlMail = new HtmlMail(
                "fen@369.free",
                "liang@369.free",
                "新冠病毒肆虐",
                "武汉P4病毒实验室");
        // 创建一个邮件发送服务器
        MailServer server = new MailServer(htmlMail);
        // 发送邮件
        server.sendMail();
    }
}
