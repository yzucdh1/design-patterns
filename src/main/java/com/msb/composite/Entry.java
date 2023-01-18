package com.msb.composite;

/**
 * 抽象节点
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 11:03
 */
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public abstract Entry add(Entry entry);

    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
