package com.msb.state.table;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/7/27 8:51
 */
public enum Event {

    GOT_MUSH_ROOM(0),
    GOT_CAPE(1),
    GOT_FIRE_FLOWER(2),
    MEET_MONSTER(3),
    ;

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
