package cn.avicted.webSocket.config;

import cn.avicted.webSocket.controller.MarcoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @ClassName WebSocketConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/11/011 14:32
 * @Version 1.0
 **/
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    /**
    * @Author xulei
    * @Description 将MarcoHandler映射到"/marco"
    * @Date 14:36 2019/6/11/011
    * @Param [webSocketHandlerRegistry]
    * @return void
    **/
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(marcoHandler(),"/marco");
    }

    @Bean
    public MarcoHandler marcoHandler() {
        return new MarcoHandler();
    }


    /**
    * @Author xulei
    * @Description 使用SockJS
    * @Date 9:14 2019/6/12/012
    * @Param [webSocketHandlerRegistry]
    * @return void
    **/
    /*@Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(marcoHandler(),"/marco").withSockJS();
    }*/


}
