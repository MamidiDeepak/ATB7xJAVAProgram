import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) throws Exception {

        String name = "Deepak";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String receivedName = sc.next();

        if(name.equalsIgnoreCase(receivedName)){

            try{
                throw new Exception("Name matched");
            }catch (Exception e) {
                throw new Exception("Name does not matched at all");
            }
        }else
        {
            System.out.println("does not match");
        }
        System.out.println("final statement printed..");
    }

}
