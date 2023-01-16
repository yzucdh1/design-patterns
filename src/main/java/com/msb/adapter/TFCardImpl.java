package com.msb.adapter;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:32
 */
public class TFCardImpl implements TFCard {

    @Override
    public String read() {
        System.out.println("从tf卡读取数据");
        return "read tf card data";
    }

    @Override
    public void write(String data) {
        System.out.println("向tf卡写入数据:" + data);
    }
}
