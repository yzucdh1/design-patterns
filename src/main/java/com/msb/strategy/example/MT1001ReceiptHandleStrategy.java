package com.msb.strategy.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/21 18:51
 */
public class MT1001ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handle() {
        System.out.println("处理MT1001的回执消息");
    }
}
