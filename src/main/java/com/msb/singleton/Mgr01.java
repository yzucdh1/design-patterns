package com.msb.singleton;

/**
 * 饿汉式
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 15:03
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
