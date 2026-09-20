import java.util.Scanner;

public class reverseString {

    public static void printRev(String str, int idx) {

        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] rags) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String st = sc.next();
        printRev(st, st.length() - 1);
        sc.close();
    }
}
