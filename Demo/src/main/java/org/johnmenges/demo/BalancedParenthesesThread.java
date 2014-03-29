/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.websocket.Session;

/**
 *
 * @author JohnMenges
 */
public class BalancedParenthesesThread extends Thread {
    public BalancedParenthesesThread(BalancedParenthesesInput input, Session session)
    {
        this.input = input;
        this.session = session;
    }

    @Override
    public void run() {
        System.out.printf("thread %s\n", input);
        char[] chars = input.getString().toCharArray();
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.addValue(
                "array",
                jsonHelper.getValue("elements", jsonHelper.getValue(chars))
                );
        jsonHelper.send(session);
    }
    
    private BalancedParenthesesInput input;
    private Session session;
 }
