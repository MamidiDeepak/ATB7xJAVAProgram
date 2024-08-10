package Encapsulation;

public class classOne {

    private String name;

    private int age;

    classOne(){
        System.out.println("Default constructor executed....");
    }

    classOne(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(boolean isadmin){
        if(isadmin) {
            this.name = name;
            System.out.println(name+" name set successfully.");
        }else {
            System.out.println("Only Admin can set name.");
        }
    }

    public void setAge(boolean isadmin) {
        if(isadmin) {
            this.age = age;
            System.out.println(age+" Age saved successfully.");
        }else {
            System.out.println("To set the age you need to be admin.");
        }
    }

    public String getName(boolean isadmin){
        if(isadmin){
            System.out.println(name+" is the name available.");
        }else {
            System.out.println("You need to be admin to see name.");
        }
        return name;
    }

    public int getAge(boolean isadmin) {
        if(isadmin) {
            System.out.println(age+" Age can be accessed.");
        }else {
            System.out.println("You need to be admin to check age.");
        }

        return age;
    }

}
