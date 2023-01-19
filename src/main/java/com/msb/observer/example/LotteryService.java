package com.msb.observer.example;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:33
 */
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventType.MQ, EventType.MESSAGE);
        eventManager.subscribe(EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventType.MESSAGE, new MessageEventListener());
    }

    protected final LotteryResult lotteryAndMessage(String uId) {
        LotteryResult lottery = lottery(uId);
        eventManager.notifyListeners(EventType.MESSAGE, lottery);
        eventManager.notifyListeners(EventType.MQ, lottery);
        return lottery;
    }

    public abstract LotteryResult lottery(String uId);
}
