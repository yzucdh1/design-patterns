package com.msb.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 9:16
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
