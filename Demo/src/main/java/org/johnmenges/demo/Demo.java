/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import javax.json.JsonValue;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author JohnMenges
 */
@ServerEndpoint("/demo")
public class Demo {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("onMessage " + session);
        JsonHelper.send(session, "demos", demos);
    }

    @OnMessage
    public void onMessage(Session session, String message) {
        System.out.println("onMessage " + message);
    }
    
    private String[] demos = {"BalancedParentheses"};
}

