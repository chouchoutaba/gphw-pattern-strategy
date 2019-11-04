package com.gphw.pattern.strategy.trip;

public class ResultMsg {
    private int code;
    private Object data;
    private String msg;

    public ResultMsg(int code,Object data,String msg){
        this.code=code;
        this.data=data;
        this.msg=msg;
    }

    public String toString(){
        return "出行状态：[" + code + "]," + msg + ",购票详情：" + data;
    }

}
