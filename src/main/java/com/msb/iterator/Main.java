package com.msb.iterator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 11:00
 */
public class Main {

    public static void main(String[] args) {
        Topic[] topics = new Topic[4];
        topics[0] = new Topic("title1");
        topics[1] = new Topic("title2");
        topics[2] = new Topic("title3");
        topics[3] = new Topic("title4");
        TopicList topicList = new TopicList(topics);
        IteratorIterator<Topic> iterator = topicList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
