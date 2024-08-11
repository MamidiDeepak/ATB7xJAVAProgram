package Polymorphism;

public class MethodOverridingClassTwo extends MethodOverridingClassOne {

    @Override
    public void shout() {
        super.shout();
    }

    public void bark(){
        System.out.println("It is barking from class Two.");
    }

    public void run(){
        System.out.println("It is shouting from class Two.");
    }

}
