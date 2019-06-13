package cn.avicted.stomp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @ClassName WebSocketStompConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/12/012 13:34
 * @Version 1.0
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketStompConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
       /* registry.enableSimpleBroker("/queue","/topic");
        registry.setApplicationDestinationPrefixes("/app");*/


        //开启STOMP代理中继（broker relay）功能
        registry.enableStompBrokerRelay("/queue","/topic")
                .setRelayHost("rabbit.remoteServerAddress")
                .setRelayPort(62633)
                .setClientLogin("xuleiUsername")
                .setClientPasscode("letmein0101");
        registry.setApplicationDestinationPrefixes("/app","/foo");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint("/marcopolo").withSockJS();
    }
}
