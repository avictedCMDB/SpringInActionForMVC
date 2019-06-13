package cn.avicted.email.test;

import cn.avicted.email.controller.MailSenderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @ClassName EmailTest
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/13/013 10:40
 * @Version 1.0
 **/
public class EmailTest {

    /**
    * @Author xulei
    * @Description 发送附件
    * @Date 11:18 2019/6/13/013
    * @Param [args]
    * @return void
    **/
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-email.xml");
        MailSenderController senderController = (MailSenderController) ac.getBean("MailSenderController");

        JavaMailSender javaMailSender = senderController.getMailSender();
        MimeMessage mime = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(mime, true, "utf-8");
            // 收件人邮箱地址
            helper.setTo("lx_lhcly@163.com");
            // 收件人
            helper.setFrom("xulei");
            // 主题
            helper.setSubject("测试邮件，请忽略");
            // 邮件正文
            helper.setText("测试Spring的自动发送邮件功能");
            // 添加附件
            FileSystemResource imageFile = new FileSystemResource("/usr/temp/image/coupon.png");
            helper.addAttachment("Coupon.png", imageFile);

        } catch (MessagingException me) {
            me.printStackTrace();
            System.out.println(me.getMessage());
        }

        // 执行发送功能
        javaMailSender.send(mime);

    }
}
