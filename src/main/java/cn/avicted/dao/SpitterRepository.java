package cn.avicted.dao;

import cn.avicted.model.Spitter;

public interface SpitterRepository {
    Boolean save(Spitter spitter);
    Spitter findByUsername(String username);

}
