package com.msb.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * 具体加密的装饰器类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 9:52
 */
public class Base64EncryptDataLoaderDecorator extends AbstractDataLoaderDecorator {

    public Base64EncryptDataLoaderDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    // 加密
    public String encode(String data) {
        return new String(Base64.getEncoder().encode(data.getBytes(StandardCharsets.UTF_8)));
    }

    // 解密
    public String decode(String data) {
        return new String(Base64.getDecoder().decode(data.getBytes(StandardCharsets.UTF_8)));
    }
}
