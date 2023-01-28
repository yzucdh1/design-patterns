package com.msb.visitor;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:38
 */
public interface Acceptable {

    void accept(Visitor visitor);
}
