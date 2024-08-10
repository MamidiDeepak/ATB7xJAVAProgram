package PackageTwo;

public class ClassTwoInPackageTwo {

        public String carName;

        public int carAge;

        protected void carDetails(){
            System.out.println("these are the car details..");
        }

    public static void main(String[] args) {

            ClassTwoInPackageTwo cbv = new ClassTwoInPackageTwo();
            cbv.carDetails();
    }
}
