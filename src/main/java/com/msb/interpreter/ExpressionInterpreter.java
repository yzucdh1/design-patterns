package com.msb.interpreter;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 14:30
 */
public class ExpressionInterpreter {

    private Deque<Expression> numbers = new LinkedList<>();

    public long interpreter(String expression) {
        String[] arr = expression.split(" ");
        int length = arr.length;

        for (int i = 0; i < (length + 1) / 2; i++) {
            numbers.addLast(new NumExpression(Long.parseLong(arr[i])));
        }
        for (int i = (length + 1) / 2; i < arr.length; i++) {
            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            String operator = arr[i];

            Expression result;
            if ("+".equals(operator)) {
                result = new PluExpression(exp1, exp2);
            } else if ("-".equals(operator)) {
                result = new SubExpression(exp1, exp2);
            } else if ("*".equals(operator)) {
                result = new MulExpression(exp1, exp2);
            } else if ("/".equals(operator)) {
                result = new DivExpression(exp1, exp2);
            } else {
                throw new RuntimeException("无效表达式!");
            }

            long num = result.interpreter();
            numbers.addFirst(new NumExpression(num));
        }
        if (numbers.size() != 1) {
            throw new RuntimeException("无效表达式!");
        }
        return numbers.poll().interpreter();
    }
}
