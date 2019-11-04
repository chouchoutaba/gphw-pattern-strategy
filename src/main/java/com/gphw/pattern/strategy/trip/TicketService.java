package com.gphw.pattern.strategy.trip;


import com.gphw.pattern.strategy.trip.tripMode.TripMode;
import com.gphw.pattern.strategy.trip.tripMode.TripStrategy;

public class TicketService {
    private String uid;
    private double amount;

    public TicketService(String uid, double amount) {
        this.uid = uid;
        this.amount = amount;
    }

    public ResultMsg trip(String mode) {
        TripMode tripMode = TripStrategy.getTripMode(mode);
        System.out.println("准备出去旅游，开始买票");
        return tripMode.trip(this.amount);

    }
}
