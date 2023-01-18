package com.msb.flyweight;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:53
 */
public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight a1 = factory.getFlyweight("A");
        Flyweight a2 = factory.getFlyweight("A");

        System.out.println(a1 == a2);

        UnsharedFlyweight u1 = new UnsharedFlyweight("U");
        UnsharedFlyweight u2 = new UnsharedFlyweight("U");
        System.out.println(u1 == u2);
    }
}
