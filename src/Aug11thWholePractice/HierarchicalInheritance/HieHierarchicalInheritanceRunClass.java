package Aug11thWholePractice.HierarchicalInheritance;

import Aug11thWholePractice.multiplevelInheritance.Son;

public class HierarchicalInheritanceRunClass {

    public static void main(String[] args) {

       Son son = new Son();

       System.out.println("_________");

        son.setSonName("Umessh");
        son.setFatherName("Shubham");
        son.setGrandFatherName("Rohit");

        System.out.println("_________");

        son.setSonAge(28);
        son.setFatherAge(34);
        son.setGrandFatherAge(38);

        System.out.println("_________");

        son.getSonName();
        son.getFatherName();
        son.getGrandFatherName();

        System.out.println("_________");

        son.getSonAge();
        son.getFatherAge();
        son.getGrandFatherAge();

    }

}
