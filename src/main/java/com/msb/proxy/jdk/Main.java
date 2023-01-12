package com.msb.proxy.jdk;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/11 13:41
 */
public class Main {

    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        ProxyInstanceFactory proxyFactory = new ProxyInstanceFactory(userDao);

        // 利用jdk动态代理
        IUserDao proxyInstance = (IUserDao) proxyFactory.getProxyInstance();
        proxyInstance.save();
    }
}
