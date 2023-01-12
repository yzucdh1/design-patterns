package com.msb.factory.abstractfactory;

/**
 * 抽象工厂(产品族)
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 14:41
 */
public abstract class AbstractFactory {

    public abstract TV createTV();

    public abstract Refrigerator createRefrigerator();
}
