package com.msb.prototype;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 16:30
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // 浅克隆
//        Person p1 = new Person("tom", 20, new Person.Location(new StringBuilder("street"), 12));
//        Person p2 = (Person) p1.clone();
//        System.out.println(p1.location == p2.location);
//        System.out.println(p1);
//        System.out.println(p2);
//        p2.location.street.reverse();
//        System.out.println(p1.location.street);

        // 深克隆
        Person p1 = new Person("tom", 20, new Person.Location(new StringBuilder("street"), 12));
        Person p2 = (Person) p1.clone();
        p2.location = (Person.Location) p1.location.clone();
        System.out.println(p1.location == p2.location);
        System.out.println(p1);
        System.out.println(p2);
        p2.location.street.reverse();
        System.out.println(p1.location.street);
    }
}
