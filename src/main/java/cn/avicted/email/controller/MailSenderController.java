package cn.avicted.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @ClassName MailSenderController
 * @Description 发送邮件
 * @Author xulei
 * @Date 2019/6/13/013 10:38
 * @Version 1.0
 **/
public class MailSenderController{

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(SimpleMailMessage mail) {
        javaMailSender.send(mail);
    }

    public JavaMailSender getMailSender() {
        return this.javaMailSender;
    }



}
