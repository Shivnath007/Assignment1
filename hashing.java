import java.util.Scanner;
import java.util.HashMap;

public class hashing {

    // public static int freq(int num, int arr[], int n) {
    //     int counter = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == num) {
    //             counter += 1;
    //         }
    //     }
    //     return counter;
    // }

    // This is not an example of hashing this is build for building hashing concept
    // because this will take more time to execute
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number that you find out how many times it occurs in array: ");
        // int num = sc.nextInt();
        // System.out.println("Enter the value of n: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of array:  ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int val = freq(num, arr, n);
        // System.out.print("The number of times num happens is: ");
        // System.out.println(val);

        // build frequency map this approach for a better frequency count of a number
        // HashMap<Integer, Integer> hash = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        // }

        // System.out.println("Enter the value of q: ");
        // int q = sc.nextInt();

        // while (q-- > 0) {
        //     System.out.println("Enter a number: ");
        //     int number = sc.nextInt();
        //     System.out.println(hash.getOrDefault(number, 0));
        // }
        System.out.println("Enter a string");
        String s = sc.nextLine();

        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (var entry : hash.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();

    }

}
