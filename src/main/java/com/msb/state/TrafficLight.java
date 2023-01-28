package com.msb.state;

/**
 * 交通灯类,上下文的类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:20
 */
public class TrafficLight {

    private State state = new RedState();

    public void setState(State state) {
        this.state = state;
    }

    public void switchToRed() {
        state.switchToRed();
    }

    public void switchToGreen() {
        state.switchToGreen();
    }

    public void switchToYellow() {
        state.switchToYellow();
    }
}
