package com.msb.command;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:58
 */
public class OrderCommand implements Command {

    private Chef chef;

    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("餐桌" + order.getDiningTable() + "的订单:");
        for (String foodName : order.getFoodMenus().keySet()) {
            chef.cook(foodName, order.getFoodMenus().get(foodName));
        }
        System.out.println("餐桌" + order.getDiningTable() + "的订单已上齐!");
    }
}
