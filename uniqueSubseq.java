import java.util.HashSet;
import java.util.Scanner;

public class uniqueSubseq {

    public static void unique(String str, int idx, String newString, HashSet <String> set) {
        if(idx == str.length()) {

            if(set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char curreChar = str.charAt(idx);
        // choice 
        unique(str, idx+1, newString+curreChar, set);

        // no choice
        unique(str, idx+1, newString, set);
    }

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        HashSet <String> set = new HashSet<>();

        System.out.println("Enter your string: ");
        String str = sc.next();

        unique(str, 0, "", set);

        sc.close();


    }
}
