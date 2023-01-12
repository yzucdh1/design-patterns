package com.msb.factory.abstractfactory;

/**
 * 海信的工厂
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 14:45
 */
public class HaisenceFactory extends AbstractFactory {

    @Override
    public TV createTV() {
        return new HaisenceTV();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new HaisenceRefrigerator();
    }
}
