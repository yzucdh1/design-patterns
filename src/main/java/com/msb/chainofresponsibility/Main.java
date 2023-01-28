package com.msb.chainofresponsibility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 9:58
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        AuthLink authLink = new Level3AuthLink("10013", "张三")
                .setNext(new Level2AuthLink("10012", "李四")
                        .setNext(new Level1AuthLink("10011", "王五")));

        System.out.println(authLink.doAuth("研发人员", sdf.parse("2022-11-12 13:00:00")));

        AuthService.auth("10013", new Date());

        System.out.println(authLink.doAuth("研发人员", sdf.parse("2022-11-12 13:00:00")));

        AuthService.auth("10012", new Date());

        System.out.println(authLink.doAuth("研发人员", sdf.parse("2022-11-12 13:00:00")));

        AuthService.auth("10011", new Date());

        System.out.println(authLink.doAuth("研发人员", sdf.parse("2022-11-12 13:00:00")));
    }
}
