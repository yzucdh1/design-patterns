package com.msb.strategy.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/21 18:55
 */
public class ReceiptHandleStrategyFactory {

    private static Map<String, ReceiptHandleStrategy> map;

    public static void init() {
        map = new HashMap<>();
        map.put("MT1001", new MT1001ReceiptHandleStrategy());
        map.put("MT2001", new MT2001ReceiptHandleStrategy());
    }

    public static ReceiptHandleStrategy getStrategy(String type) {
        return map.get(type);
    }
}
