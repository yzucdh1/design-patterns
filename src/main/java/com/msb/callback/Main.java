package com.msb.callback;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/2/9 10:50
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.execute("select * from user");
    }
}
