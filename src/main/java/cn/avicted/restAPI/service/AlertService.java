package cn.avicted.restAPI.service;

import cn.avicted.model.Spittle;
import org.springframework.stereotype.Service;

@Service
public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
    Spittle receiveSpittleAlert();
    Spittle retrieve();
}
