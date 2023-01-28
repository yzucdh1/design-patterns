package com.msb.iterator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:38
 */
public class Topic {

    private String title;

    public Topic(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "title='" + title + '\'' +
                '}';
    }
}
