package com.msb.iterator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:47
 */
public class TopicList implements ListList<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> createIterator() {
        return new TopicIterator(topics);
    }
}
