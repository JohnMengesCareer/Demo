/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.johnmenges.demo;

/**
 *
 * @author JohnMenges
 */
public class BalancedParenthesesInput {

    public BalancedParenthesesInput(String string, int stepDelay) {
        this.string = string;
        this.stepDelay = stepDelay;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getStepDelay() {
        return stepDelay;
    }

    public void setStepDelay(int stepDelay) {
        this.stepDelay = stepDelay;
    }
    
    @Override
    public String toString() {
        return "string " + string + " stepDelay " + stepDelay;
    }
    
    private String string;
    private int stepDelay;
}
