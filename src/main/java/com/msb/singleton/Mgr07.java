package com.msb.singleton;

/**
 * 静态内部类的方式
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 15:14
 */
public class Mgr07 {

    private Mgr07() {
    }

    // 静态内部类可以实现懒加载
    private static class Mgr07Holder {
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr07.getInstance().hashCode())).start();
        }
    }
}
