package com.msb.interpreter;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 14:25
 */
public class NumExpression implements Expression {

    private long num;

    public NumExpression(long num) {
        this.num = num;
    }

    @Override
    public long interpreter() {
        return this.num;
    }
}
