package com.aug23rdAfterNoon.interfacePracticing;

public interface Father{

    void loan();
    void home();

    default void defaultMethodInFatherclass(){
        System.out.println("I am Father class with default Method");
    }

    static void staticMethodInFatherClass(){
        System.out.println("I am static method in static block in Father class");
    }
}
