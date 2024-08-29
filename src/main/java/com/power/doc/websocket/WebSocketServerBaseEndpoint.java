package com.power.doc.websocket;

import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;

/**
 * WebSocket ServerBaseEndpoint
 *
 * @author linwumingshi
 */
@Component
@ServerEndpoint(value = "/smart-doc/websocket")
public class WebSocketServerBaseEndpoint {

    /**
     * session
     */
    private Session session;

    /**
     * OnOpen method
     *
     * @param session session
     */
    @OnOpen
    public void webSocketServerEndpointOnOpen(Session session) {
        this.session = session;
    }

}
