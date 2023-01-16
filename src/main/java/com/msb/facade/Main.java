package com.msb.facade;

/**
 * 外观模式(门面模式)测试类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:11
 */
public class Main {

    public static void main(String[] args) {
        SmartSpeakerFacade smartSpeakerFacade = new SmartSpeakerFacade();
        smartSpeakerFacade.say("打开家电");
        System.out.println("===================");
        smartSpeakerFacade.say("关闭家电");
    }
}
