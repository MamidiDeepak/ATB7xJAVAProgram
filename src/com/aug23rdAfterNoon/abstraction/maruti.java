package com.aug23rdAfterNoon.abstraction;

public class maruti extends Engine{

    @Override
    void startEngine() {
        System.out.println("Maruti starts with Keys");
    }

    @Override
    void stopEngine() {
        System.out.println("Maruti stops with keys");
    }

    @Override
    void gearsToSwitch() {
        System.out.println("5 gears");
    }

    @Override
    void startWithKeys() {
        System.out.println("Instead keys Maruti need keys to start");
    }
}
