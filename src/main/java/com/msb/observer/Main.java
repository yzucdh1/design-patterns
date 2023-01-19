package com.msb.observer;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 9:20
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());
        subject.notifyObservers();
    }
}
