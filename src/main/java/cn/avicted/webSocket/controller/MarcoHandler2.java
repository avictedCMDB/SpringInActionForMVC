package cn.avicted.webSocket.controller;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

/**
 * @ClassName MarcoHandler2
 * @Description BinaryWebSocketHandler是AbstractWebSocketHandler的子类，重载了handlerTextMessage()方法，如果收到二进制消息，将会关闭WebSocket连接！
 * @Author xulei
 * @Date 2019/6/11/011 14:13
 * @Version 1.0
 **/
public class MarcoHandler2 extends BinaryWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        super.handleTextMessage(session, message);
    }


}
