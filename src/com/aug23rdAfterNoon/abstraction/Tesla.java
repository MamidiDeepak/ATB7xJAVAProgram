package com.aug23rdAfterNoon.abstraction;

public class Tesla extends Engine{

    @Override
    void startEngine() {
        System.out.println("Tesla starts without Keys");
    }

    @Override
    void stopEngine() {
        System.out.println("Tesla stops without keys");
    }

    @Override
    void gearsToSwitch() {
        System.out.println("No gears");
    }

    @Override
    void startWithKeys() {
        System.out.println("Instead keys Tesla has Touch");
    }
}
