package com.msb.bridge;

import java.math.BigDecimal;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 9:55
 */
public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract void transfer(String uid, String orderId, BigDecimal amount);

}
