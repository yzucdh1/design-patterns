package com.msb.observer.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:16
 */
public class MessageEventListener implements EventListener {

    @Override
    public void update(LotteryResult lotteryResult) {
        System.out.println("发送摇号信息,用户id:" + lotteryResult.getuId() + ",摇号结果:" + lotteryResult.getMessage());
    }
}
