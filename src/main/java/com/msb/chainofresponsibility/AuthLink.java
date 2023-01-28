package com.msb.chainofresponsibility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 9:33
 */
public abstract class AuthLink {

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String levelUserId;

    protected String levelUserName;

    protected AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink setNext(AuthLink next){
        this.next = next;
        return this;
    }

    public abstract String doAuth(String userId, Date authDate);
}
