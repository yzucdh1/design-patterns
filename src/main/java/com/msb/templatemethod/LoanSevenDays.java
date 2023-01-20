package com.msb.templatemethod;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 8:38
 */
public class LoanSevenDays extends Account {

    @Override
    public void calculate() {
        System.out.println("贷款7天无利息,但是需要收取1%的服务费");
    }

    @Override
    public void display() {
        System.out.println("贷款7天无利息");
    }
}
