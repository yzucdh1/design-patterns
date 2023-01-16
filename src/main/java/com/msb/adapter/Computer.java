package com.msb.adapter;

/**
 * 电脑类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:35
 */
public class Computer {

    private SDCard sdCard;

    public Computer(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String read() {
        return sdCard.read();
    }

    public void write(String data) {
        sdCard.write(data);
    }
}
