package Array;

import java.util.Arrays;
import java.util.Scanner;

public class maxminInArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements : ");
        for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();  
        }
        Arrays.sort(arr);
        int min = arr[0];
         int max = arr[n-1];

         System.out.println("Minimum elements :" + min);
         System.out.println("Maximum elements :" + max);

    }
}
