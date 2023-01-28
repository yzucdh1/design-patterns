package com.msb.state;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:20
 */
public class YellowState implements State {

    @Override
    public void switchToRed() {
        System.out.println("黄灯状态切换成红灯状态!");
    }

    @Override
    public void switchToGreen() {
        System.out.println("黄灯状态切换成绿灯状态!");
    }

    @Override
    public void switchToYellow() {
        System.out.println("当前状态为黄灯状态,无需切换!");
    }
}
