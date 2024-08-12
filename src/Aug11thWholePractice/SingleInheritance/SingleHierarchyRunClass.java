package Aug11thWholePractice.SingleHierarchy;

public class SingleHierarchyRunClass {

    public static void main(String[] args) {

        Son son = new Son("68HJ^&*(S56", "5776GH%&^96");

        son.setSonName("DeepakMamidi");
        son.setSonAge(32);
        son.getSonName();
        son.getSonAge();

        System.out.println("_______________");

        son.setFatherName("Amit");
        son.setFatherAge(55);
        son.getFatherName();
        son.getSonAge();


    }
}
