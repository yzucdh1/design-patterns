package com.msb.adapter;

/**
 * SD卡到TF卡的适配器
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 10:41
 */
public class SD2TFAdapter implements SDCard {

    private TFCard tfCard;

    public SD2TFAdapter() {
        this.tfCard = new TFCardImpl();
    }

    @Override
    public String read() {
        return tfCard.read();
    }

    @Override
    public void write(String data) {
        tfCard.write(data);
    }
}
