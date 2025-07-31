import java.util.Scanner;

public class sortZOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements (only 0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }

        sc.close();
    }
}
