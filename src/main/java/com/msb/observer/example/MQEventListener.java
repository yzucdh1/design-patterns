package com.msb.observer.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:18
 */
public class MQEventListener implements EventListener {

    @Override
    public void update(LotteryResult lotteryResult) {
        System.out.println("保存摇号信息到MQ,用户id:" + lotteryResult.getuId() + ",摇号结果:" + lotteryResult.getMessage());
    }
}
