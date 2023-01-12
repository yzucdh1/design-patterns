package com.msb.bridge;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 10:20
 */
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("人脸校验通过,用户:" + uid);
        return true;
    }
}
