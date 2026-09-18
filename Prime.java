import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int count = 0;
        
        // first approach
        // for(int i = 1; i <= n; i++){
        // if(n % i == 0) count++;
        // }
        // if(count == 2)
        // System.out.println("It is a prime number");
        // else
        // System.err.println("It is not a prime number.");


        // second approach
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0)
                count++;
            if ((n / i) != i)
                count++;
        }
        if (count == 2)
            System.err.println("Prime");
        else
            System.err.println("Not prime");


        sc.close();
    }

}
