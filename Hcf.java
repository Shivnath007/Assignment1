import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        //first approach
        // int hcf = 1;
        // for(int i = 1; i <= n2; i++){
        // if(n1 % i == 0){
        // if(n2 % i == 0){
        // hcf = i;
        // }
        // }
        // }
        // System.out.println(hcf);


        //second approach
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }
        if (n1 == 0) {
            System.out.println(n2);
        } else
            System.out.println(n1);
        sc.close();

    }

}
