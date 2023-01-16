package com.msb.builder.build;

import com.msb.builder.product.Bike;

/**
 * 抽象的建造者类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 13:15
 */
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract Builder buildFrame();

    public abstract Builder buildSeat();

    public abstract Bike build();
}
