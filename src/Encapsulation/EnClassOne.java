package Encapsulation;

public class EnClassOne {

    private String name;

    private int age;

    public EnClassOne(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(boolean isadmin){
        if(isadmin) {
//            this.name = name;
            System.out.println(name + " is the added name.");
        }else {
            System.out.println("You need to be admin to add name");
        }
    }

    public void setAge(boolean isadmin){
        if(isadmin) {
//            this.age = age;
            System.out.println(age + " is the added age.");
        }else {
            System.out.println("You need to be admin to add age");
        }
    }

    public String getName(boolean isadmin){
        if(isadmin){
            System.out.println(name+" is the name retrieved.");
        }else {
            System.out.println("You need to be admin to view the name.");
        }
        return name;
    }

    public int getAge(boolean isadmin){
        if(isadmin){
            System.out.println(age+" is the age retrieved.");
        }else{
            System.out.println("you need to be admin to view the age.");
        }
        return age;
    }
}
