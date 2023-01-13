package com.msb.decorator;

/**
 * 抽象的装饰器类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 9:45
 */
public abstract class AbstractDataLoaderDecorator implements DataLoader {

    private DataLoader dataLoader;

    public AbstractDataLoaderDecorator(DataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }

    @Override
    public String read() {
        return dataLoader.read();
    }

    @Override
    public void write(String data) {
        dataLoader.write(data);
    }
}
