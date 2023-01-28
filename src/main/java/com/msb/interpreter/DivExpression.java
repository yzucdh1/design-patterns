package com.msb.interpreter;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 14:28
 */
public class DivExpression implements Expression {

    private Expression exp1;

    private Expression exp2;

    public DivExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpreter() {
        return exp1.interpreter() / exp2.interpreter();
    }
}
