package com.msb.observer.example;

import java.util.Date;

/**
 * 摇奖结果封装类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:12
 */
public class LotteryResult {

    private String uId;

    private String message;

    private Date dateTime;

    public LotteryResult(String uId, String message, Date dateTime) {
        this.uId = uId;
        this.message = message;
        this.dateTime = dateTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "uId='" + uId + '\'' +
                ", message='" + message + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
