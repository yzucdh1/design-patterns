package com.msb.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:53
 */
public class Order {

    private int diningTable; // 餐桌号码

    private Map<String, Integer> foodMenus;

    public Order(int diningTable) {
        this.diningTable = diningTable;
        this.foodMenus = new HashMap<>();
    }

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenus() {
        return foodMenus;
    }

    public void setFoodMenus(Map<String, Integer> foodMenus) {
        this.foodMenus = foodMenus;
    }
}
