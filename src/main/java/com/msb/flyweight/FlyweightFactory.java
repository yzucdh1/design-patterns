package com.msb.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:49
 */
public class FlyweightFactory {

    private final Map<String, Flyweight> pool = new HashMap<>();

    public FlyweightFactory() {
        pool.put("A", new ConcreteFlyweight("A"));
        pool.put("B", new ConcreteFlyweight("B"));
        pool.put("C", new ConcreteFlyweight("C"));
    }

    public Flyweight getFlyweight(String key) {
        if (pool.containsKey(key)) {
            return pool.get(key);
        }
        Flyweight flyweight = new ConcreteFlyweight(key);
        pool.put(key, flyweight);
        return flyweight;
    }
}
