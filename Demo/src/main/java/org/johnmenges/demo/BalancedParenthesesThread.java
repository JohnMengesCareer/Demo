/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

import javax.websocket.Session;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.johnmenges.javaparser.JavaLexer;
import org.johnmenges.javaparser.JavaParser;

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
//        JsonHelper jsonHelper = new JsonHelper();
//        jsonHelper.addValue(
//                "array",
//                jsonHelper.getValue("elements", jsonHelper.getValue(chars))
//                );
//        jsonHelper.send(session);
//        System.out.println("after send");
        String klass = "class Foo {}";
        ANTLRInputStream input = new ANTLRInputStream(klass);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        System.out.println(tree.toStringTree(parser));
    }
    
    private BalancedParenthesesInput input;
    private Session session;
 }
