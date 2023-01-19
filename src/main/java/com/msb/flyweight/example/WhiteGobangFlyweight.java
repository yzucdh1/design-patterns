package com.msb.flyweight.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 8:43
 */
public class WhiteGobangFlyweight extends GobangFlyweight {

    @Override
    public String getColor() {
        return "白色";
    }

    @Override
    public void display() {
        System.out.println("显示的棋子的颜色为:" + getColor());
    }
}
