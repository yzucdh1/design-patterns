package com.msb.factory.abstractfactory;

/**
 * 海尔的工厂
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 14:45
 */
public class HaierFactory extends AbstractFactory {

    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }
}
