package com.msb.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/11 9:50
 */
public class ProxyInstanceFactory {

    private IUserDao target;

    public ProxyInstanceFactory(IUserDao target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // 利用jdk动态代理的api
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开启事务");
                    Object result = method.invoke(target, args);
                    System.out.println("提交事务");
                    return result;
                });
    }
}
