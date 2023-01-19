package com.msb.observer.example;

import java.util.Date;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/19 16:42
 */
public class LotteryServiceImpl extends LotteryService {

    private DrawHouseService houseService;

    public LotteryServiceImpl() {
        houseService = new DrawHouseService();
    }

    @Override
    public LotteryResult lottery(String uId) {
        String message = houseService.lots(uId);
        return new LotteryResult(uId, message, new Date());
    }
}
