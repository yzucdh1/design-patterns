package com.msb.observer.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:47
 */
public class Main {

    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.lotteryAndMessage("2342342375588");
        System.out.println(lotteryResult);
    }
}
