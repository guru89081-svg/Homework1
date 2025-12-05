package guru.com;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       

        System.out.print("Enter number to search: ");
        int Search = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == Search) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Number " + Search + " is present in the array.");
        else
            System.out.println("Number " + Search + " is NOT present in the array.");
    }
}
