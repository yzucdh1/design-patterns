package com.msb.strategy.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/21 18:53
 */
public class ReceiptHandleContext {

    private ReceiptHandleStrategy strategy;

    public void setStrategy(ReceiptHandleStrategy strategy) {
        this.strategy = strategy;
    }

    public void handle() {
        strategy.handle();
    }
}
