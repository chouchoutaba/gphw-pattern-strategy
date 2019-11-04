package com.gphw.pattern.strategy.trip.tripMode;

public class Plane extends TripMode{
    @Override
    public String getName() {
        return "坐✈";
    }

    @Override
    protected double getCost() {
        return 800;
    }
}
