package org.johnmenges.demo;

import java.io.IOException;
import java.util.ArrayList;
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
        catch (IOException e)
        {
            System.out.println("send Exception: " + e.getMessage());
        }        
    }
    
    public static void send(Session session, String tag, String[] strings)
    {
        send(session, getValue(tag, getArray(strings)));
    }
    
    public static <T> void send(Session session, String tag, ArrayList<NameValuePair<T>> pairs)
    {
        send(session, getValue(tag, getArray(pairs)));
    }
    
    public static JsonValue getArray(String[] strings)
    {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (String s : strings)
        {
            arrayBuilder.add(s);
        }
        return arrayBuilder.build();
    }
    
    public static <T> JsonValue getArray(ArrayList<NameValuePair<T>> pairs)
    {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (NameValuePair<T> pair : pairs)
        {
            JsonValue value = getValue(pair.getName(), pair.getValue().toString());
            arrayBuilder.add(value);
        }
        return arrayBuilder.build();
    }
    
    public static JsonValue getValue(String tag, JsonValue value)
    {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add(tag, value);
        return objectBuilder.build();
    }
    
    public static JsonValue getValue(String tag, String value)
    {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add(tag, value);
        return objectBuilder.build();
    }
    
}
