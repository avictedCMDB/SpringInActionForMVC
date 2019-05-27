package cn.avicted.remoteService.serviceImpl;

import cn.avicted.model.Spitter;
import cn.avicted.model.Spittle;
import cn.avicted.remoteService.service.SpitterService;

import java.util.List;

/**
 * @ClassName SpitterServiceImpl
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/24/024 10:56
 * @Version 1.0
 **/
public class SpitterServiceImpl implements SpitterService {

    @Override
    public List<Spittle> getRecentSpittle(int count) {
        return null;
    }

    @Override
    public void saveSpittle(Spittle spittle) {

    }

    @Override
    public void saveSpitter(Spitter spitter) {

    }

    @Override
    public Spitter getSpitter(long id) {
        return null;
    }

    @Override
    public void startFollowing(Spitter follower, Spitter followee) {

    }

    @Override
    public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
        return null;
    }

    @Override
    public List<Spittle> getSpittlesForSpitter(String username) {
        return null;
    }

    @Override
    public Spitter getSpitter(String username) {
        return null;
    }

    @Override
    public Spittle getSpittleById(long id) {
        return null;
    }

    @Override
    public void deleteSpittle(long id) {

    }

    @Override
    public List<Spitter> getAllSpitters() {
        return null;
    }


}
