package com.msb.iterator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 10:49
 */
public class TopicIterator implements IteratorIterator<Topic> {

    private Topic[] topics;

    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        this.position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < topics.length;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }
}
