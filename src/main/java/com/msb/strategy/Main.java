package com.msb.strategy;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 9:06
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyB());
        context.algorithm();
    }
}
