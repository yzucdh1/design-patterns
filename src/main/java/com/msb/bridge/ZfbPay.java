package com.msb.bridge;

import java.math.BigDecimal;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 11:21
 */
public class ZfbPay extends Pay {

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public void transfer(String uid, String orderId, BigDecimal amount) {
        boolean security = payMode.security(uid);
        if (!security) {
            System.out.println("支付宝交易失败!");
            return;
        }
        System.out.println("支付宝交易成功,用户id:" + uid + ",订单id:" + orderId + ",交易金额:" + amount);
    }
}
