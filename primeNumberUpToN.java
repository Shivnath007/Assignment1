import java.util.Scanner;

public class primeNumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    continue;
                }
            }
        }
        sc.close();
    }
}
