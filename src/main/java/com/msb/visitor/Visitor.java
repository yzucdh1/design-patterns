package com.msb.visitor;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:16
 */
public interface Visitor {

    void visitor(Candy candy);

    void visitor(Wine wine);

    void visitor(Fruit fruit);
}
