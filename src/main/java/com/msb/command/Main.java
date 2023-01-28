package com.msb.command;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 14:10
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order(15);
        order.getFoodMenus().put("糖醋排骨", 1);
        order.getFoodMenus().put("红烧肉", 1);
        order.getFoodMenus().put("韭菜豆芽", 2);
        Command orderCommand = new OrderCommand(new Chef(), order);

        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand);
        waiter.orderUp();
    }
}
