package com.msb.callback;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/2/9 10:36
 */
public class Context {

    private void execute(Callback callback, String arg) {
        System.out.println("callback之前的通用业务逻辑......");
        callback.callback(arg);
        System.out.println("callback之后的通用业务逻辑......");
    }

    public void execute(String arg) {

        class ConcreteCallback implements Callback {

            ConcreteCallback() {
            }

            @Override
            public void callback(String arg) {
                System.out.println("回调接口被调用,参数为:" + arg);
            }
        }

        execute(new ConcreteCallback(), arg);
    }
}
