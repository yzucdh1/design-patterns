package com.msb.templatemethod;

/**
 * 抽象模板类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 8:31
 */
public abstract class Account {

    public boolean validate(String account, String password) {
        System.out.println("账号:" + account + ",密码:" + password);
        return account.equalsIgnoreCase("tom") && password.equalsIgnoreCase("123456");
    }

    public abstract void calculate();

    public void display() {
        System.out.println("显示利息");
    }

    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账号或者密码错误!");
            return;
        }
        calculate();
        display();
    }
}
