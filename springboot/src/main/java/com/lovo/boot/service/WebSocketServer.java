package com.lovo.boot.service;


import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/websocket")
@Component
public class WebSocketServer {

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;

    }
    @OnClose
    public void onClose() {

    }

    /**
     * 收到客户端消息后调用的方法
     * @param message
     * @param session
     */
   @OnMessage
    public void onMessage(String message, Session session) throws IOException {
       System.out.println("收到前端内容："+message);
       this.sendMessage("我是后台");
    }

    /**
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {

        error.printStackTrace();
    }
    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }


}
