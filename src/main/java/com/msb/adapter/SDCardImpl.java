package com.msb.adapter;

/**
 * SD卡具体实现类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:30
 */
public class SDCardImpl implements SDCard {

    @Override
    public String read() {
        System.out.println("从sd卡读取数据");
        return "read sd card data";
    }

    @Override
    public void write(String data) {
        System.out.println("向sd卡写入数据:" + data);
    }
}
