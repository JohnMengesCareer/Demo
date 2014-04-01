/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.johnmenges.javaparser.JavaLexer;
import org.johnmenges.javaparser.JavaParser;

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
    public void onMessage(Session session, String message)
    {
        System.out.println("onMessage " + message);
        JsonObject json = Json.createReader(new StringReader(message)).readObject();
        if (json.containsKey("demo"))
        {
            String demo = json.getString("demo");
            loadDemo(demo);
        }
    }
    
    private final String demoPath
            = "/Volumes/Menges/Development/GitHub/Demo/Demo/src/main/java/org/johnmenges/demo/source";
    private final String[] demos = {"BalancedParentheses"};
    
    private void loadDemo(String demo)
    {
        File file = new File(demoPath, demo + ".java");
        if (!file.exists()) return;
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
            JavaLexer lexer = new JavaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new JavaDemoInstrumenter(parser), tree);
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}

