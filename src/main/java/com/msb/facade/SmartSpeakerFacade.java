package com.msb.facade;

/**
 * 智能音箱门面类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:04
 */
public class SmartSpeakerFacade {

    private AirConditioner airConditioner;

    private Light light;

    private TV tv;

    public SmartSpeakerFacade() {
        this.airConditioner = new AirConditioner();
        this.light = new Light();
        this.tv = new TV();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        }
    }

    private void on() {
        System.out.println("起床模式:");
        light.on();
        airConditioner.on();
        tv.on();
    }

    private void off() {
        System.out.println("睡眠模式:");
        light.off();
        airConditioner.off();
        tv.off();
    }
}
