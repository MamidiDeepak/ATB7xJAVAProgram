package ex_2ndaug;

public class ClassTwo {

    public static void main(String[] args) {

        ClassOne co = new ClassOne();
        co.color = "red";
        co.brand = "Tata";
        co.speed = 40;
        co.year = 2024;
        co.model = "jaguar";

        co.accelerate(1);
//        System.out.println(co.speed);

        co.ApplyBrakes(2);
        System.out.println(co.speed);


    }
}