/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import java.math.BigDecimal;
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
    public JsonHelper()
    {
        objectBuilder = Json.createObjectBuilder();
    }
    
    public JsonValue getValue(char[] chars)
    {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (int i = 0; i < chars.length; i++)
        {
            arrayBuilder.add(Character.toString(chars[i]));
        }
        return arrayBuilder.build();
    }
    
    public void addValue(String tag, JsonValue value)
    {
        objectBuilder.add(tag, value);
    }
    
    public JsonValue getValue(String tag, JsonValue value)
    {
        JsonObjectBuilder newObjectBuilder = Json.createObjectBuilder();
        newObjectBuilder.add(tag, value);
        return newObjectBuilder.build();
    }
    
    public void send(Session session)
    {
        String message = objectBuilder.build().toString();
        try
        {
            session.getBasicRemote().sendText(message);
        }
        catch (Exception e)
        {
            System.out.println("send Exception: " + e.getMessage());
        }
    }
    
    private JsonObjectBuilder objectBuilder;
}
