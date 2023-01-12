package com.msb.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 9:43
 */
public class UserLogProxy implements MethodInterceptor {

    private UserService userService;

    public UserLogProxy(UserService userService) {
        this.userService = userService;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("记录日志信息......");
        return methodProxy.invokeSuper(o, args);
    }
}
