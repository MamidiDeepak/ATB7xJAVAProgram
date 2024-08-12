package Aug11thWholePractice.polymorphism.MethodOverLoading.MethodOverriding;

public class MethodOverridingClassOne {

    MethodOverridingClassOne(){
        System.out.println("This is constructor in classOne");
    }

    MethodOverridingClassOne(int a, int b){
        System.out.println("This is constructor in classOne");
    }

    MethodOverridingClassOne(String a, String b){
        System.out.println("This is constructor in classOne");
    }

    public void barking(){
        System.out.println("I am barking in classOne...");
    }

    public void barking(int a){
        System.out.println("I am barking in classOne..."+a);
    }

    public void barking(int a, int b){
        System.out.println("I am barking in classOne..."+a+" "+b);
    }

    public void barking(String a, String b){
        System.out.println("I am barking in classOne..."+a+" "+b);
    }
}
