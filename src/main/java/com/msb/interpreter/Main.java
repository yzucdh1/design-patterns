package com.msb.interpreter;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 14:30
 */
public class Main {

    public static void main(String[] args) {
        String expression = "9 5 7 3 7 + - * /";
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        System.out.println(interpreter.interpreter(expression));
    }
}
