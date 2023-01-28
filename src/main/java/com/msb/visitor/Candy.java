package com.msb.visitor;

import java.time.LocalDate;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:13
 */
public class Candy extends Product implements Acceptable {

    public Candy(String name, LocalDate localDate, double price) {
        super(name, localDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
