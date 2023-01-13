package com.msb.decorator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 9:44
 */
public class Main {

    public static void main(String[] args) {
        DataLoader dataLoader = new BaseFileDataLoader("demo.txt");
        AbstractDataLoaderDecorator decorator = new Base64EncryptDataLoaderDecorator(dataLoader);
        AbstractDataLoaderDecorator decorator2 = new Base64EncryptDataLoaderDecorator(decorator);

        decorator2.write("name:tom,age:20");
        String result = decorator2.read();
        System.out.println(result);
    }
}
