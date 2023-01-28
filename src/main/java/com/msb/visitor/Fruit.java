package com.msb.visitor;

import java.time.LocalDate;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:15
 */
public class Fruit extends Product implements Acceptable {

    private int weight;

    public Fruit(String name, LocalDate localDate, double price, int weight) {
        super(name, localDate, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
