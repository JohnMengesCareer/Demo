
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author JohnMenges
 */
@ServerEndpoint(value="/BalancedParentheses", decoders={BalancedParenthesesDecoder.class})
public class BalancedParenthesesEndpoint {
   
    @OnOpen
    public void onOpen (Session peer) {
        System.out.printf("onOpen %s\n", peer);
        peers.add(peer);
    }

   @OnClose
    public void onClose (Session peer) {
       System.out.printf("onClose %s\n", peer);
       peers.remove(peer);
    }

    @OnMessage
    public void onMessage(BalancedParenthesesInput parameters, Session peer) {
        System.out.printf("onMessage %s %s\n", parameters, peer);
        Thread thread = new BalancedParenthesesThread(parameters, peer);
        threads.put(peer, thread);
        thread.start();
    }
    
    private static final Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());
    private static final HashMap<Session, Thread> threads = new HashMap<>();

}
