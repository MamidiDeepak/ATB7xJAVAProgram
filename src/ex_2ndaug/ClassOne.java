package ex_2ndaug;

public class ClassOne {

    String color;
    String brand;
    int speed;
    int year;
    String model;

    public void accelerate(int ac){
        speed += ac;
        System.out.println(speed);
    }

    public void ApplyBrakes(int acc){
        speed -= acc;
    }
}
