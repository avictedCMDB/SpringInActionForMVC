package cn.avicted.restAPI.serviceImpl;

import cn.avicted.model.Spittle;
import cn.avicted.restAPI.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @ClassName AlertServiceImpl
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/29/029 15:34
 * @Version 1.0
 **/
public class AlertServiceImpl implements AlertService {

    @Autowired
    private JmsOperations jmsOperations;

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


}
