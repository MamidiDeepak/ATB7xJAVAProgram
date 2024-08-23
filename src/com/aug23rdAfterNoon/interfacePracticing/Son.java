package com.aug23rdAfterNoon.interfacePracticing;

public class Son implements Mother, Father{

    @Override
    public void loan() {
        System.out.println("I am clearing my mother and father loans!!");
    }

    @Override
    public void home() {
        System.out.println("My dad gave me house to live.");
    }

    {
        System.out.println("--I am IIB. I gets called when object got created---");
    }

    static {
        System.out.println("---I am static block. I gets called when class loaded-----");
    }
}
