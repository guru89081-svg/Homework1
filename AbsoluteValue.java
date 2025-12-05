package guru.com;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number<0) {
			number=-number;
					}
		System.out.println("absolute value is  "+number);
		sc.close();
	}

}
