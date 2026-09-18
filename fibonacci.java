import java.util.Scanner;

public class fibonacci {
    //find out nth fibonacci number 
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibo(n - 1);
        int slast = fibo(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fib = fibo(n);
        System.out.println(fib);
        sc.close();
    }
}