package Array;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int[] padds = new int[n];

        // System.out.print("Enter " + n + " elements of array : ");
        // for(int i = 0; i < n; i++){
        //     padds[i] = sc.nextInt();
        // }    
        
        System.out.println("Elements of array are : " );
        for(int i =0;i<n;i++){
            System.out.print("[" + padds[i]  + "]");
        }


    }
}
