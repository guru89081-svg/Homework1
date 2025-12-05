package guru.com;


import java.util.Scanner;

public class Multiplesof5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
Multiplesof5.isMultiples(arr);	
}
public static void isMultiples(int arr[]) {
	int count=0;
	for(int n:arr) { 
		if(n%5==0) {
		count++;
		}
	}
	System.out.println("number of elements divisible by 5="+count);
}
}
