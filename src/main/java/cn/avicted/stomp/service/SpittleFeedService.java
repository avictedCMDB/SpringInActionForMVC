package cn.avicted.stomp.service;

import cn.avicted.model.Spittle;
import cn.avicted.stomp.model.SpittleFrom;

import java.security.Principal;

public interface SpittleFeedService {
    void broadcastSpittle(Spittle spittle);

    //Notification handleSpittle(Principal principal, SpittleFrom form);

}
