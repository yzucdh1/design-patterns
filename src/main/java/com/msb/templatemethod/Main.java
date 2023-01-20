package com.msb.templatemethod;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 8:42
 */
public class Main {

    public static void main(String[] args) {
        Account account1 = new LoanOneMonth();
        account1.handle("tom", "123456");

        System.out.println("===========================");

        Account account2 = new LoanSevenDays();
        account2.handle("tom", "123456");
    }
}
