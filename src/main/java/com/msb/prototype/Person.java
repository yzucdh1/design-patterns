package com.msb.prototype;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 16:24
 */
public class Person implements Cloneable {

    String name;

    int age;

    Location location;

    public Person(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
    }

    public static class Location implements Cloneable {

        StringBuilder street;
        int roomNo;

        public Location(StringBuilder street, int roomNo) {
            this.street = street;
            this.roomNo = roomNo;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "street=" + street +
                    ", roomNo=" + roomNo +
                    '}';
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
