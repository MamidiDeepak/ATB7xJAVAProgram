package aug092024;

public class reverseAString {
    public static void main(String[] args) {

        String name = "Deepak";

        char ch;

        String reversed = " ";

        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i);

            reversed = ch+reversed;
        }
        System.out.println(reversed);
    }
}
