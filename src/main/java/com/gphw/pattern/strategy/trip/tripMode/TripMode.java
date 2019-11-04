package com.gphw.pattern.strategy.trip.tripMode;

import com.gphw.pattern.strategy.trip.ResultMsg;

public abstract class TripMode {

    public abstract String getName();

    protected abstract double getCost();

    public ResultMsg trip(double amount){
        if(getCost()>amount){
            return new ResultMsg(500,"购票失败","票价大于余额");
        }else{
            return new ResultMsg(200,"购票成功,可以去旅游了，","买票花费："+getCost());
        }
    }

}
