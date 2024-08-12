package Aug11thWholePractice.SingleHierarchy;

public class Son extends Father {

    private String sonName;
    private int sonAge;

    Son(String sonDBAccess, String fatherDBAccess){
        super(fatherDBAccess);
        System.out.println("Connected to son's DB successfully "+sonDBAccess);
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
        System.out.println("sonName set as "+sonName);
    }

    public String getSonName() {
        System.out.println("Retrieved son Name "+sonName);
        return sonName;
    }

    public void setSonAge(int sonAge) {
        this.sonAge = sonAge;
        System.out.println("Son age set as "+sonAge);
    }

    public int getSonAge() {
        System.out.println("Retrieved son age "+sonAge);
        return sonAge;
    }


}
