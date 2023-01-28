package com.msb.state;

/**
 * 抽象状态接口类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:18
 */
public interface State {

    void switchToRed();

    void switchToGreen();

    void switchToYellow();
}
