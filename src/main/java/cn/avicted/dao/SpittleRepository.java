package cn.avicted.dao;

import cn.avicted.model.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittleId);
    Boolean saveSpittle(Spittle spittle);


}
