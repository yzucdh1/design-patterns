package com.msb.mediator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 15:25
 */
public abstract class Person {

    protected Mediator mediator;

    protected String name;

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
}
