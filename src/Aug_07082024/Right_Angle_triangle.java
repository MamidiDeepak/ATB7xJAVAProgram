package Aug_07082024;

public class Right_Angle_triangle {
    public static void main(String[] args) {

            int side1 = 2;
            int side2 = 3;
            int side3 = 1;

            if(side1==side2 && side1==side3){
                System.out.println("It is Equilateral Triangle..");
            }else if(side1==side3 || side2==side3){
                System.out.println("It is Isoceles Triangle..");
            }else {
                System.out.println("It is Scalable Triangle");
            }
    }
}
