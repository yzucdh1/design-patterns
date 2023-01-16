package com.msb.builder.product;

/**
 * 需要建造的产品类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 11:29
 */
public class Bike {

    private String frame;

    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
