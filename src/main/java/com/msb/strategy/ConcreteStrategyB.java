package com.msb.strategy;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 9:04
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("具体策略B");
    }
}
