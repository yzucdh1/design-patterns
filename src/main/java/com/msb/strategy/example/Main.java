package com.msb.strategy.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/21 19:02
 */
public class Main {

    public static void main(String[] args) {
        ReceiptHandleStrategyFactory.init();
        ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getStrategy("MT1001");
        ReceiptHandleContext context = new ReceiptHandleContext();
        context.setStrategy(strategy);
        context.handle();
    }
}
