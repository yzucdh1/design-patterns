package com.msb.visitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:34
 */
public class Main {

    public static void main(String[] args) {
        Visitor visitor = new DiscountVisitor(LocalDate.of(2023, 1, 28));
        Candy candy = new Candy("德芙巧克力", LocalDate.of(2023, 1, 8), 100);
        Wine wine = new Wine("茅台", LocalDate.of(2023, 1, 8), 1000);
        Fruit fruit = new Fruit("草莓", LocalDate.of(2023, 1, 23), 10, 2);

        List<Acceptable> products = new ArrayList<>();
        products.add(candy);
        products.add(wine);
        products.add(fruit);

        for (Acceptable product : products) {
            product.accept(visitor);
        }
    }
}
