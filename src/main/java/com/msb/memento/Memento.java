package com.msb.memento;

/**
 * 跟发起人在同一个包中
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:26
 */
class Memento {

    private String state = "从备份恢复到原始状态";

    private String id;

    private String name;

    public Memento(String id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
