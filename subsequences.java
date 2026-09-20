import java.util.Scanner;

public class subsequences {

    public static void subsequenses(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char curreChar = str.charAt(idx);
        // for choice 
        subsequenses(str, idx+1, newString + curreChar);

        // for not choice
        subsequenses(str, idx+1, newString);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.next();

        subsequenses(str, 0, "");
        sc.close();

    }
}
