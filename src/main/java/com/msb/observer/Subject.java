package com.msb.observer;

/**
 * 抽象的被观察者
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 9:09
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
