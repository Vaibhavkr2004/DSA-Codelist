import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter kth smallest number: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if (k > 0 && k <= n) {
            System.out.print("The " + k + "th smallest in the array is: " + arr[k - 1]);
        } else {
            System.out.print("Invalid value of k.");
        }

        sc.close();
    }
}
