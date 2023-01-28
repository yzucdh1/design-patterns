package com.msb.chainofresponsibility;

import java.text.ParseException;
import java.util.Date;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 9:56
 */
public class Level1AuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2022-11-11 00:00:00");
    private Date endDate = sdf.parse("2022-11-31 00:00:00");

    public Level1AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public String doAuth(String userId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId);
        if (date == null) {
            return "等待1级审核,审核人:" + levelUserName;
        }
        if (next == null) {
            return "1级审核通过,审核人:" + levelUserName;
        }
        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return "1级审核通过,审核人:" + levelUserName;
        }
        return next.doAuth(userId, authDate);
    }
}
