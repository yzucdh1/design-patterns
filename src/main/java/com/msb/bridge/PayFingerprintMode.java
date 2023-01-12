package com.msb.bridge;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 10:22
 */
public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("指纹校验通过,用户:" + uid);
        return true;
    }
}
