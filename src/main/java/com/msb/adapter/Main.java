package com.msb.adapter;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 9:38
 */
public class Main {

    public static void main(String[] args) {
        SDCard sdCard = new SDCardImpl();
        Computer computer = new Computer(sdCard);
        computer.write("write data to sd card");
        System.out.println(computer.read());

        System.out.println("=================================");

        SD2TFAdapter adapter = new SD2TFAdapter();
        Computer computer2 = new Computer(adapter);
        computer2.write("write data to tf card");
        System.out.println(computer2.read());
    }
}
