package cn.avicted.stomp.controller;

import cn.avicted.stomp.model.Shout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

/**
 * @ClassName MarcoController
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/12/012 14:03
 * @Version 1.0
 **/
@Controller
public class MarcoController {
    private static final Logger logger = LoggerFactory.getLogger(MarcoController.class);

    @MessageMapping("/marco") // app/marco
    public void handleShout(Shout shout) {

        logger.info("Received message: " + shout.getMessage());
    }

    /**
    * @Author xulei
    * @Description 服务端发送数据给客户端的方法之一：作为处理消息或者处理订阅的附带结果。
    * @Date 8:23 2019/6/13/013
    * @Param [incoming]
    * @return cn.avicted.stomp.model.Shout
    **/
    @MessageMapping("/marco")
    public Shout handlShout1(Shout incoming) {
        logger.info("Received message: " + incoming.getMessage());

        Shout outgoing = new Shout();
        outgoing.setMessage("Polo!");
        return outgoing;
    }

    @SubscribeMapping("marco") // app/marco
    public Shout handleSubscription() {
        Shout outgong = new Shout();
        outgong.setMessage("Polo!");
        return outgong;
    }



}
