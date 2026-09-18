
public class arrayswap {
    public static void swap(int arr[], int i, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        swap(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 7};
        int n = arr.length;
        swap(arr, 0, n);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
