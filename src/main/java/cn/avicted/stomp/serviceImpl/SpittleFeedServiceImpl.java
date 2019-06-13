package cn.avicted.stomp.serviceImpl;

import cn.avicted.dao.SpittleRepository;
import cn.avicted.model.Spittle;
import cn.avicted.stomp.model.SpittleFrom;
import cn.avicted.stomp.service.SpittleFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.annotation.SendToUser;

import java.security.Principal;

/**
 * @ClassName SpittleFeedServiceImpl
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/13/013 8:49
 * @Version 1.0
 **/
public class SpittleFeedServiceImpl implements SpittleFeedService {

    @Autowired
    private SimpMessageSendingOperations messaging;

    @Autowired
    private SpittleRepository spittleRepository;

    @Override
    public void broadcastSpittle(Spittle spittle) {
        messaging.convertAndSend("/topic/spittlefeed", spittle);
    }

    /*@MessageMapping("/spittle")
    @SendToUser("/queue/notifications")
    public Notification handleSpittle(Principal principal, SpittleFrom form) {
        Spittle spittle = new Spittle();
        spittle.setMessage(principal.getName());
        spittle.setTime(form.getDate().toString());

        spittleRepository.saveSpittle(spittle);

        return new Notification("Saved Spittle");
    }*/





}
