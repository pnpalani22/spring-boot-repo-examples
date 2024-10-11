package com.bofa.training.numberservicewithcloudbus.domain;

public class Number {
    private int min;
    private int max;
    public Number() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Number(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    
    

}