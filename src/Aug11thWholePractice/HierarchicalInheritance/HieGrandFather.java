package Aug11thWholePractice.HierarchicalInheritance;

public class GrandFather {

    private String grandFatherName;
    private int grandFatherAge;

    public void setGrandFatherName(String grandFatherName) {
        this.grandFatherName = grandFatherName;
        System.out.println("Grand Father Name set as "+grandFatherName);
    }

    public String getGrandFatherName() {
        System.out.println("Retrieved Grand Father Name "+grandFatherName);
        return grandFatherName;
    }

    public void setGrandFatherAge(int grandFatherAge) {
        this.grandFatherAge = grandFatherAge;
        System.out.println("Grand Father Age set as "+grandFatherAge);
    }

    public int getGrandFatherAge() {
        System.out.println("Retrieved Grand Father Age "+grandFatherAge);
        return grandFatherAge;
    }


}
