package com.msb.chainofresponsibility;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟审核服务
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 9:27
 */
public class AuthService {

    private static final Map<String, Date> authMap = new HashMap<>();

    public static void auth(String userId, Date date) {
        authMap.put(userId, date);
    }

    public static Date queryAuthInfo(String userId) {
        return authMap.get(userId);
    }
}
