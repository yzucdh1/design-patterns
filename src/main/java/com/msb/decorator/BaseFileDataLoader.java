package com.msb.decorator;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * 具体的基础组件类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/13 9:32
 */
public class BaseFileDataLoader implements DataLoader {

    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        try {
            return FileUtils.readFileToString(new File(filePath), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath), data, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
