import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int dup = n;
        int revNum = 0;
        while(n > 0){
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n /= 10;
        }
        if (dup == revNum)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    sc.close();
    }
    

}