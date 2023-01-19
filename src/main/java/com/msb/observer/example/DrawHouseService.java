package com.msb.observer.example;

/**
 * 模拟摇号
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:09
 */
public class DrawHouseService {

    // 摇号服务
    public String lots(String uId) {
        if (uId.hashCode() % 2 == 0) {
            return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签!";
        } else {
            return "很遗憾,ID为: " + uId + "的用户,您本次未中签!";
        }
    }
}
