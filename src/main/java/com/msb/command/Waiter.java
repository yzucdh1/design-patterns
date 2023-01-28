package com.msb.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:52
 */
public class Waiter {

    private List<Command> commands;

    public Waiter() {
        this.commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void orderUp() {
        System.out.println("叮咚!服务员接到订单,开始请厨师烧菜:");
        for (Command command : commands) {
            command.execute();
        }
    }
}
