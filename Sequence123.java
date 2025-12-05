package guru.com;

import java.util.Scanner;

public class Sequence123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
boolean found = false;

		        for (int i = 0; i < arr.length - 2; i++) {
		            if (arr[i] == 1 && arr[i+1] == 2 && arr[i+2] == 3) {
		                found = true;
		                break;
		            }
		            sc.close();
		        }

		        System.out.println(found);
		    }
		}
	


