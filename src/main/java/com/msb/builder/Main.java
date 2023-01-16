package com.msb.builder;

import com.msb.builder.build.MoBikeBuilder;
import com.msb.builder.director.Director;
import com.msb.builder.product.Bike;
import com.msb.builder.product.RabbitMQClient;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 13:21
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director(new MoBikeBuilder());
        Bike bike = director.buildBike();
        System.out.println(bike);

        System.out.println("==============================");

        RabbitMQClient rabbitMQClient = new RabbitMQClient.RabbitMQClientBuilder()
                .host("192.168.56.101").port(8080)
                .mode(1).queue("queue").build();
        rabbitMQClient.sendMessage("hello RabbitMQ!");
    }
}
