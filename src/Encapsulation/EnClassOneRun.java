package Encapsulation;

public class EnClassOneRun {

    public static void main(String[] args) {

        EnClassOne econe = new EnClassOne("Mamidi Deepak", 32);
        econe.setName(true);
        econe.setAge(true);

        System.out.println();
        econe.getName(true);
        econe.getAge(true);
    }
}
