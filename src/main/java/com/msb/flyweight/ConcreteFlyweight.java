package com.msb.flyweight;

/**
 * 具体的可共享的享元类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:44
 */
public class ConcreteFlyweight extends Flyweight {

    private String inState;

    public ConcreteFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("可共享的享元对象内部状态:" + inState + ",外部状态:" + state);
    }
}
