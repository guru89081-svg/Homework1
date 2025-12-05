package guru.com;

import java.util.Scanner;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		        boolean result = false;

		        if (arr.length >= 1) {
		            if (arr[0] == 6 || arr[arr.length - 1] == 6)
		                result = true;
		        }

		        System.out.println(result);
		    }
		}
	


