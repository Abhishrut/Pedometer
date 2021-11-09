package com.example.pedometer;

// Will listen to step alerts
public interface StepListener {

    void step(long timeNs);

}