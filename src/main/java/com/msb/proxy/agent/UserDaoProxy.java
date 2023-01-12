package com.msb.proxy.agent;

import com.msb.proxy.jdk.IUserDao;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/11 9:30
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("提交事务");
    }
}
