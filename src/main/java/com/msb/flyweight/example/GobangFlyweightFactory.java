package com.msb.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 8:47
 */
public class GobangFlyweightFactory {

    private static Map<String, GobangFlyweight> pool;

    private GobangFlyweightFactory() {
        pool = new HashMap<>();
        pool.put("w", new WhiteGobangFlyweight());
        pool.put("b", new BlackGobangFlyweight());
    }

    private static class SingletonHolder {
        private static final GobangFlyweightFactory INSTANCE = new GobangFlyweightFactory();
    }

    public static GobangFlyweightFactory getFactory() {
        return SingletonHolder.INSTANCE;
    }

    public GobangFlyweight getFlyweight(String key) {
        return pool.get(key);
    }
}
