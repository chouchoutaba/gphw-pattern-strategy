package com.gphw.pattern.strategy.trip.tripMode;

import java.util.HashMap;
import java.util.Map;

public class TripStrategy {
    private final static String BY_TRAIN="BY_TRAIN";
    private final static String BY_PLANE="BY_PLANE";
    private final static String BY_SHIP="BY_SHIP";
    private final static String DEFAULT=BY_TRAIN;

    private static Map<String,TripMode> TRIP_MODE_MAP=new HashMap<String,TripMode>();

    static{
        TRIP_MODE_MAP.put(BY_TRAIN,new Train());
        TRIP_MODE_MAP.put(BY_PLANE,new Plane());
        TRIP_MODE_MAP.put(BY_SHIP,new SteamShip());
    }

    private TripStrategy(){}

    public static TripMode getTripMode(String mode){
        if(!TRIP_MODE_MAP.containsKey(mode)){
            return TRIP_MODE_MAP.get(DEFAULT);
        }
        return TRIP_MODE_MAP.get(mode);
    }
}
