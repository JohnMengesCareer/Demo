/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 *
 * @author JohnMenges
 */
public class BalancedParenthesesDecoder implements Decoder.Text<BalancedParenthesesInput> {

    @Override
    public BalancedParenthesesInput decode(String message) throws DecodeException {
        JsonObject json = Json.createReader(new StringReader(message)).readObject();
        String string = json.getString("string");
        int stepDelay = json.getInt("stepDelay");
        BalancedParenthesesInput parameters = new BalancedParenthesesInput(string, stepDelay);
        return parameters;
    }

    @Override
    public boolean willDecode(String arg0) {
        return true;
    }

    @Override
    public void init(EndpointConfig config) {
    }

    @Override
    public void destroy() {
    }
    
}
