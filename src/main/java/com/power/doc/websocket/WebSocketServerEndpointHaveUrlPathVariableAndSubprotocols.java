package com.power.doc.websocket;

import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;

/**
 * WebSocket ServerEndpoint Have UrlPathVariable And Subprotocols
 *
 * @author linwumingshi
 */
@ServerEndpoint(value = "/smart-doc/websocket/subprotocols/{id}", subprotocols = {"smart-doc", "test2"})
public class WebSocketServerEndpointHaveUrlPathVariableAndSubprotocols {

    /**
     * url PathVariable id
     */
    private String id;

    /**
     * session
     */
    private Session session;

    /**
     * OnOpen method
     *
     * @param id      url PathVariable id
     * @param session session
     */
    @OnOpen
    public void webSocketServerEndpointOnOpen(@PathParam(value = "id") String id, Session session) {
        this.id = id;
        this.session = session;
    }

}
