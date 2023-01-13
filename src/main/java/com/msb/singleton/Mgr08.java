package com.msb.singleton;

/**
 * 不仅可以实现单例,还可以防止反射和反序列化
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 16:10
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {
        System.out.println("m");
    }

    public static Mgr08 getInstance() {
        return Mgr08.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr08.getInstance().hashCode())).start();
        }
    }
}
