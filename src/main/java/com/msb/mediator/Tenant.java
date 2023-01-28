package com.msb.mediator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 15:30
 */
public class Tenant extends Person {

    public Tenant(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租客" + name + "收到信息:" + message);
    }

}
