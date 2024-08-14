package Aug_07082024;

public class ReversalOfAString {
    public static void main(String[] args) {

        String name = "DeepakMamidi";

        char ch = ' ';

        String reversedName = " ";

        for(int i=0; i<name.length(); i++){

            ch = name.charAt(i);

            reversedName = ch + reversedName;
        }

        System.out.println(reversedName);


    }
}
