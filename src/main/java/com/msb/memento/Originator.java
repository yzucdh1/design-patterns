package com.msb.memento;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:26
 */
public class Originator {

    private String state = "原始状态";

    private String id;

    private String name;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Originator(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Memento createMemento() {
        return new Memento(this.getId(), this.getName());
    }

    public void restore(Memento memento) {
        this.id = memento.getId();
        this.name = memento.getName();
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
