package com.aug23rdAfterNoon.interfacePracticing;

public class RunClass {
    public static void main(String[] args) {

        Son s = new Son();
        s.loan();
        s.home();

        Mother.staticMethodInMotherClass();

       Mother m = new Son();
       m.defaultMethodInMotherclass();

       Father.staticMethodInFatherClass();

       Father f = new Son();
       f.defaultMethodInFatherclass();
       f.home();

    }
}