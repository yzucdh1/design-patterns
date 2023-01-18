package com.msb.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:08
 */
public class Directory extends Entry {

    private String name;

    private final List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + this);
        }
    }
}
