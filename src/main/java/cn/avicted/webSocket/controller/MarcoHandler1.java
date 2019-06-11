package cn.avicted.webSocket.controller;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @ClassName MarcoHandler1
 * @Description TextWebSocketHandler是AbstractWebSocketHandler的子类，重载了handlerBinaryMessage()方法，如果收到二进制消息，将会关闭WebSocket连接！
 * @Author xulei
 * @Date 2019/6/11/011 14:13
 * @Version 1.0
 **/
public class MarcoHandler1 extends TextWebSocketHandler {

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
        super.handleBinaryMessage(session, message);
    }


}
