package com.msb.memento;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:27
 */
public class Caretaker {

    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
