package cn.avicted.remoteService.service;

import cn.avicted.model.Spitter;
import cn.avicted.model.Spittle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpitterService {
    List<Spittle> getRecentSpittle(int count);
    void saveSpittle(Spittle spittle);
    void saveSpitter(Spitter spitter);
    Spitter getSpitter(long id);
    void startFollowing(Spitter follower, Spitter followee);
    List<Spittle> getSpittlesForSpitter(Spitter spitter);
    List<Spittle> getSpittlesForSpitter(String username);

    Spitter getSpitter(String username);
    Spittle getSpittleById(long id);
    void deleteSpittle(long id);
    List<Spitter> getAllSpitters();

}
