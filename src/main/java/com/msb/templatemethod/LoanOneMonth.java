package com.msb.templatemethod;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/20 8:38
 */
public class LoanOneMonth extends Account {

    @Override
    public void calculate() {
        System.out.println("贷款一个月的利息为本金的10%");
    }
}
