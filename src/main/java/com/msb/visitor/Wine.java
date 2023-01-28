package com.msb.visitor;

import java.time.LocalDate;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:14
 */
public class Wine extends Product implements Acceptable {

    public Wine(String name, LocalDate localDate, double price) {
        super(name, localDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
