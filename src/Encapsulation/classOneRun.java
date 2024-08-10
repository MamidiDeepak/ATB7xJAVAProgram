package Encapsulation;

public class classOneRun {

    public static void main(String[] args) {

        classOne cone = new classOne("Deepak", 35);
        cone.setName(false);
        System.out.println();
        cone.getName(true);

        System.out.println();
        cone.setAge(false);
        System.out.println();
        cone.getAge(true);
    }

}
