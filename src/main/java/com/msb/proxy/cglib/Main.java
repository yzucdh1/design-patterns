package com.msb.proxy.cglib;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 9:47
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserLogProxy userLogProxy = new UserLogProxy(userService);

        UserService proxyInstance = (UserService) userLogProxy.getProxyInstance();
        proxyInstance.save();
    }
}
