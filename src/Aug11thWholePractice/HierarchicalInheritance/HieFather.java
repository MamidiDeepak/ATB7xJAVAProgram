package Aug11thWholePractice.HierarchicalInheritance;

import Aug11thWholePractice.multiplevelInheritance.GrandFather;

public class Father {

    private String fatherName;
    private int fatherAge;

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
        System.out.println("father Name set as "+fatherName);
    }

    public String getFatherName() {
        System.out.println("Retrieved father name "+fatherName);
        return fatherName;
    }

    public void setFatherAge(int fatherAge) {
        System.out.println("father Age set as "+fatherAge);
        this.fatherAge = fatherAge;
    }

    public int getFatherAge() {
        System.out.println("Retrieved father age "+fatherAge);
        return fatherAge;
    }


}

