package com.msb.observer;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 9:13
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserver1......");
    }
}
