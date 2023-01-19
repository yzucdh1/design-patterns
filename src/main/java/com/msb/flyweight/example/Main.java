package com.msb.flyweight.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 8:57
 */
public class Main {

    public static void main(String[] args) {

        GobangFlyweightFactory factory = GobangFlyweightFactory.getFactory();

        GobangFlyweight w1 = factory.getFlyweight("w");
        GobangFlyweight w2 = factory.getFlyweight("w");
        GobangFlyweight b1 = factory.getFlyweight("b");
        GobangFlyweight b2 = factory.getFlyweight("b");

        System.out.println(w1 == w2);
        System.out.println(b1 == b2);

        System.out.println("===================================");
        w1.display();
        w2.display();
        b1.display();
        b2.display();
    }
}
