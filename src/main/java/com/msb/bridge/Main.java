package com.msb.bridge;

import java.math.BigDecimal;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 11:25
 */
public class Main {

    public static void main(String[] args) {
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wx_0001", "100001", new BigDecimal(200));

        System.out.println("=================================================");

        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("zfb_0001", "100002", new BigDecimal(1000));

        System.out.println("=================================================");

        wxPay = new WxPay(new PayPasswordMode());
        wxPay.transfer("wx_0002", "100003", new BigDecimal(300));
    }
}
