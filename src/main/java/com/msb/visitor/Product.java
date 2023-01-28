package com.msb.visitor;

import java.time.LocalDate;

/**
 * 抽象商品类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:11
 */
public abstract class Product {

    private String name; // 商品名称

    private LocalDate localDate; // 生产日期

    private double price; // 商品价格

    public Product(String name, LocalDate localDate, double price) {
        this.name = name;
        this.localDate = localDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
