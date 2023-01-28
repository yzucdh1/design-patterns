package com.msb.chainofresponsibility;

import java.util.Date;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 9:44
 */
public class Level3AuthLink extends AuthLink {

    public Level3AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public String doAuth(String userId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId);
        if (date == null) {
            return "等待3级审核,审核人:" + levelUserName;
        }
        if (next == null) {
            return "3级审核通过,审核人:" + levelUserName;
        }
        return next.doAuth(userId, authDate);
    }
}
