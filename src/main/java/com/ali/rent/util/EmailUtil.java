package com.ali.rent.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * 这里要有 mail 的依赖
 */
public class EmailUtil implements Runnable{

    private String email;//收件人邮箱
    private String code;//收件人邮箱验证码;

    public EmailUtil(String email, String code) {
        this.email = email;
        this.code = code;
    }

    public void run() {
        // 1.创建连接对象javax.mail.Session
        // 2.创建邮件对象 javax.mail.Message
        // 3.发送一封激活邮件
        String from = "lnm1004405345@163.com";// 发件人电子邮箱
        String host = "smtp.qq.com"; // 指定发送邮件的主机smtp.qq.com(QQ)|smtp.163.com(网易)

        Properties properties = System.getProperties();// 获取系统属性

        properties.setProperty("mail.smtp.host", host);// 设置邮件服务器
        properties.setProperty("mail.smtp.auth", "true");// 打开认证

        try {

            // 1.获取默认session对象
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                public javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("lnm1004405345@163.com", "qwer19950210"); // 发件人邮箱账号、授权码
                }
            });

            // 2.创建邮件对象
            javax.mail.Message message = new MimeMessage(session);
            // 2.1设置发件人
            message.setFrom(new InternetAddress(from));
            // 2.2设置接收人
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            // 2.3设置邮件主题
            message.setSubject("账号激活");
            // 2.4设置邮件内容
            String content = "<html>\n" +
                    "<head>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>您好!欢迎注册<h1 style=\"color: #00b8e2\">你好,</h1>这是一封激活邮件,您的验证码为</h1><br/>\n" +
                    "<h1 style=\"color: #1e6609\">"+code+"</h1>\n" +
                    "</body>\n" +
                    "</html>";
            message.setContent(content, "text/html;charset=UTF-8");
            // 3.发送邮件
            Transport.send(message);
            System.out.println("邮件成功发送!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
