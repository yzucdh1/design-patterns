package com.msb.proxy.jdk;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/11 9:29
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存操作");
    }
}
