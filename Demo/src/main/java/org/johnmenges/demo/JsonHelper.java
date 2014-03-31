/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.websocket.Session;

/**
 *
 * @author JohnMenges
 */
public class JsonHelper {
     public static void send(Session session, JsonValue value)
    {
        String message = value.toString();
        System.out.println("send " + message);
        try
        {
            session.getBasicRemote().sendText(message);
        }
        catch (Exception e)
        {
            System.out.println("send Exception: " + e.getMessage());
        }        
    }
    
    public static void send(Session session, String tag, String[] strings)
    {
        send(session, getValue(tag, getArray(strings)));
    }
    
    private static JsonValue getArray(String[] strings)
    {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (String s : strings)
        {
            arrayBuilder.add(s);
        }
        return arrayBuilder.build();
    }
    
    private static JsonValue getValue(String tag, JsonValue value)
    {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add(tag, value);
        return objectBuilder.build();
    }
    
}
