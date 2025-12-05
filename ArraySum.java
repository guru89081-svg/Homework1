package guru.com;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum =sum+arr[i]; 
        }
        sc.close();

        System.out.println("Sum of array elements = " + sum);
    }
    
}

	


