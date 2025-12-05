package guru.com;

import java.util.Scanner;

public class GreatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1==6  ||  num2==6  ||  num1+num2==6  || num1-num2==6) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
sc.close();
	}

}
