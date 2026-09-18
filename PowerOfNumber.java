import java.util.Scanner;

public class PowerOfNumber {

    public static int powerOfNumber(int x, int n) {
        if(n == 0) {
            return  1;
        }
        if(x == 0) {
            return 0;
        }

        return x * powerOfNumber(x, n - 1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want the power: ");
        int x = sc.nextInt();

        System.out.println("Enter the power: ");
        int n  = sc.nextInt();

        int res = powerOfNumber(x, n);
        System.out.println("Power of number x: " + res);

        sc.close();
    }
}