package Aug11thWholePractice.HierarchicalInheritance;

import Aug11thWholePractice.multiplevelInheritance.Father;

public class Son extends HieGrandFather{

    private String sonName;
    private int sonAge;

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

