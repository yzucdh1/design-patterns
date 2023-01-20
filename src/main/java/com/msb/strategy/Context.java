package com.msb.strategy;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 9:05
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
