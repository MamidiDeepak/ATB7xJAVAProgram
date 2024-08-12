package Aug11thWholePractice.SingleHierarchy;

public class Father {

    private String fatherName;
    private int fatherAge;

    Father(String fatherBDAccess){
        System.out.println("Connected to Father's DB successfully "+fatherBDAccess);
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
        System.out.println("fatherName set as "+fatherName);
    }

    public String getFatherName() {
        System.out.println("Retrieved father name "+fatherName);
        return fatherName;
    }

    public void setFatherAge(int fatherAge) {
        System.out.println("fatherAge set as "+fatherAge);
        this.fatherAge = fatherAge;
    }

    public int getFatherAge() {
        System.out.println("Retrieved father age "+fatherAge);
        return fatherAge;
    }


}
