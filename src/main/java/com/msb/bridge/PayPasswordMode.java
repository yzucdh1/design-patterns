package com.msb.bridge;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 10:23
 */
public class PayPasswordMode implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("密码校验通过,用户:" + uid);
        return true;
    }
}
