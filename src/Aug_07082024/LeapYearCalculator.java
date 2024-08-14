package Aug_07082024;

public class LeapYearCalculator {
    public static void main(String[] args) {

           int year = 2074;

           boolean isLeapYear = false;

           if(year%4==0 && year%100!=0){
               isLeapYear = true;
           }

           if(isLeapYear){
               System.out.println("It is leap year..");
           }else{
               System.out.println("It is not leap year..");
           }
    }
}
