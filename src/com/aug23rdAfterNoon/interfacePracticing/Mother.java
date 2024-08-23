package com.aug23rdAfterNoon.interfacePracticing;

public interface Mother {

    void loan();

    default void defaultMethodInMotherclass(){
        System.out.println("I am mother class with default Method");
    }

    static void staticMethodInMotherClass(){
        System.out.println("I am static method in static block in mother class");
    }

}
