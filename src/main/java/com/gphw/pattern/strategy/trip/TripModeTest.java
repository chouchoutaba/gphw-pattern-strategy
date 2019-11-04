package com.gphw.pattern.strategy.trip;

import com.gphw.pattern.strategy.trip.tripMode.TripStrategy;

public class TripModeTest {
    public static void main(String[] args) {
        TicketService service = new TicketService("20191104000001",600);
        System.out.println(service.trip("BY_TRAIN"));
    }
}
