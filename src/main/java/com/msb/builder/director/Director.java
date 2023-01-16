package com.msb.builder.director;

import com.msb.builder.build.Builder;
import com.msb.builder.product.Bike;

/**
 * 导演类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 13:20
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike buildBike() {
        return builder.buildFrame().buildSeat().build();
    }
}
