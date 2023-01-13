package com.msb.decorator;

/**
 * 抽象的组件
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 9:25
 */
public interface DataLoader {

    String read();

    void write(String data);
}
