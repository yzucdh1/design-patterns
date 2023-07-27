package com.msb.state.table;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/7/27 8:51
 */
public enum State {

    SMALL(0),
    SUPER(1),
    CAPE(2),
    FIRE(3),
    ;

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
