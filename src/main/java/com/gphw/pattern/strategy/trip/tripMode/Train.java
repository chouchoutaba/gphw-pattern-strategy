package com.gphw.pattern.strategy.trip.tripMode;

public class Train extends TripMode{
    @Override
    public String getName() {
        return "坐🚂";
    }

    @Override
    protected double getCost() {
        return 300;
    }
}
