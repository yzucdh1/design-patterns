package com.msb.visitor;

import java.text.NumberFormat;
import java.time.LocalDate;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:20
 */
public class DiscountVisitor implements Visitor {

    private LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("结算日期为:" + billDate);
    }

    @Override
    public void visitor(Candy candy) {
        System.out.println("糖果名称:" + candy.getName());
        long days = billDate.toEpochDay() - candy.getLocalDate().toEpochDay();
        if (days > 180) {
            System.out.println("糖果生产日期超过180天,请勿食用!");
        } else {
            double realPrice = candy.getPrice() * 0.9;
            System.out.println("糖果打折后的价格为:" + NumberFormat.getCurrencyInstance().format(realPrice));
        }
    }

    @Override
    public void visitor(Wine wine) {
        System.out.println("酒类名称:" + wine.getName());
        System.out.println("原价出售,价格为:" + NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }

    @Override
    public void visitor(Fruit fruit) {
        System.out.println("水果名称:" + fruit.getName());
        long days = billDate.toEpochDay() - fruit.getLocalDate().toEpochDay();
        double rate;
        if (days > 7) {
            System.out.println("水果生产日期超过7天,请勿食用!");
            return;
        } else if (days > 3) {
            rate = 0.5;
        } else {
            rate = 1;
        }
        double realPrice = fruit.getPrice() * fruit.getWeight() * rate;
        System.out.println("水果打折后的价格为:" + NumberFormat.getCurrencyInstance().format(realPrice));
    }
}
