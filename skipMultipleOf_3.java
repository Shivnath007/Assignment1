import java.util.Scanner;

public class skipMultipleOf_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            if (i % 3 == 0) {
                continue ;
            }
            System.out.println(i);
        }

        sc.close();
    }
}