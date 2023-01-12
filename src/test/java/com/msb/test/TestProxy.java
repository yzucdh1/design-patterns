package com.msb.test;

import com.msb.proxy.agent.UserDaoProxy;
import com.msb.proxy.jdk.IUserDao;
import com.msb.proxy.jdk.ProxyInstanceFactory;
import com.msb.proxy.jdk.UserDaoImpl;
import org.junit.Test;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/11 9:32
 */
public class TestProxy {

    @Test
    public void testProxy() {
        IUserDao userDao = new UserDaoImpl();

        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }

    @Test
    public void testProxy2() {
        IUserDao userDao = new UserDaoImpl();
        ProxyInstanceFactory proxyFactory = new ProxyInstanceFactory(userDao);

        // 利用jdk动态代理
        IUserDao proxyInstance = (IUserDao) proxyFactory.getProxyInstance();
        proxyInstance.save();
    }
}
