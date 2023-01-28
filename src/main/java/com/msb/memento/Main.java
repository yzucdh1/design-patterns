package com.msb.memento;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 13:39
 */
public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator("1", "张三");
        System.out.println(originator);
        Caretaker caretaker = new Caretaker(originator.createMemento());
        originator.setName("李四");
        System.out.println(originator);
        originator.restore(caretaker.getMemento());
        System.out.println(originator);
    }
}
