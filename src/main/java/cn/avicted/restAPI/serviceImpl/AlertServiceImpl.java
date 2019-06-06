package cn.avicted.restAPI.serviceImpl;

import cn.avicted.model.Spittle;
import cn.avicted.restAPI.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.JmsUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

/**
 * @ClassName AlertServiceImpl
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/29/029 15:34
 * @Version 1.0
 **/
@Component("alertService")
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsOperations jmsOperations;

    /**
    * @Author xulei
    * @Description 发送消息
    * @Date 8:42 2019/5/30/030
    * @Param [spittle]
    * @return void
    **/
    @Override
    public void sendSpittleAlert(final Spittle spittle) {
        // 创建消息
        MessageCreator messageCreator = new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {

                return session.createObjectMessage(spittle);
            }
        };

        // 发送消息; 指定目的地
        //jmsOperations.send("spittle.alert.queue",messageCreator );
        jmsOperations.send(messageCreator );
    }

    public void sendSpittleAlert1(Spittle spittle) {

        jmsOperations.convertAndSend(spittle);
    }

    /**
    * @Author xulei
    * @Description 接收消息
    * @Date 8:43 2019/5/30/030
    * @Param []
    * @return cn.avicted.model.Spittle
    **/
    @Override
    public Spittle receiveSpittleAlert() {
       try {
           ObjectMessage receiveMessage = (ObjectMessage) jmsOperations.receive();
           Spittle spittle = (Spittle) receiveMessage.getObject();
           return spittle;

        } catch (JMSException jmsException) {
            throw JmsUtils.convertJmsAccessException(jmsException);
        }
    }

    @Override
    public Spittle retrieve() {
        Spittle spittle = (Spittle) jmsOperations.receiveAndConvert();
        return spittle;
    }


    private JavaMailSender mailSender;
    private String alertEmailAddress;

    public AlertServiceImpl(JavaMailSender mailSender, String alertEmailAddress) {
        this.mailSender = mailSender;
        this.alertEmailAddress = alertEmailAddress;
    }

    public void sendSpittleAlert2(final Spittle spittle) {
        SimpleMailMessage message = new SimpleMailMessage();
        String spitterName = spittle.getSpitter().getFirstName();
        message.setFrom("noreply@spitter.com");
        message.setTo(alertEmailAddress);
        message.setSubject("New spittle from " + spitterName);
        message.setText(spitterName + "says: " + spittle.getMessage());
        mailSender.send(message);
    }

}
