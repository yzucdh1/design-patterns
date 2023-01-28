package com.msb.iterator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:46
 */
public interface IteratorIterator<T> {

    void reset();

    boolean hasNext();

    T next();

    T currentItem();
}
