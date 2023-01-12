package com.msb.test;

import com.msb.factory.abstractfactory.AbstractFactory;
import com.msb.factory.abstractfactory.HaisenceFactory;
import com.msb.factory.abstractfactory.Refrigerator;
import com.msb.factory.abstractfactory.TV;
import org.junit.Test;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/12 14:52
 */
public class TestAbstractFactory {

    @Test
    public void testAbstractFactory() {
        AbstractFactory factory = new HaisenceFactory();
        TV tv = factory.createTV();
        Refrigerator refrigerator = factory.createRefrigerator();
        System.out.println(tv.getClass());
        System.out.println(refrigerator.getClass());
    }
}
