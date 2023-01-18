package com.msb.flyweight;

/**
 * 不可共享的享元类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:47
 */
public class UnsharedFlyweight extends Flyweight {

    private String inState;

    public UnsharedFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("不可共享的享元对象内部状态:" + inState + ",外部状态:" + state);
    }
}
