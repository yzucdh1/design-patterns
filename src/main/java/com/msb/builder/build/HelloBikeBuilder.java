package com.msb.builder.build;

import com.msb.builder.product.Bike;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 13:23
 */
public class HelloBikeBuilder extends Builder {

    @Override
    public Builder buildFrame() {
        mBike.setFrame("铝合金车架");
        return this;
    }

    @Override
    public Builder buildSeat() {
        mBike.setSeat("塑料车座");
        return this;
    }

    @Override
    public Bike build() {
        return mBike;
    }
}
