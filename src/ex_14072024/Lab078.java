package ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String password  = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));














//        System.out.println(pass_u.equalsIgnoreCase(password));
        //Pramod@123 =  pramod@123  = PRamod@123 = PraMod@123

    }
}
