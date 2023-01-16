package com.msb.adapter;

/**
 * TF卡接口
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:27
 */
public interface TFCard {

    String read();

    void write(String data);
}
