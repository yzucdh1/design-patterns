package com.msb.observer.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件管理类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:20
 */
public class EventManager {

    private Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... eventTypes) {
        for (Enum<EventType> eventType : eventTypes) {
            this.listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> eventListeners = this.listeners.get(eventType);
        eventListeners.add(eventListener);
    }

    public void unSubscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> eventListeners = this.listeners.get(eventType);
        eventListeners.remove(eventListener);
    }

    public void notifyListeners(Enum<EventType> eventType, LotteryResult lotteryResult) {
        List<EventListener> eventListeners = this.listeners.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.update(lotteryResult);
        }
    }
}
