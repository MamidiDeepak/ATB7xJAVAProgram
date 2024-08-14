package Aug_07082024;

public class multiplicationTable {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=10; i++){

            System.out.println(n+" * "+i+" = "+i*n) ;

            if(i==5){

                System.out.println("Value" +i+" is matched and printed..");
                continue;
            }
        }
    }
}
