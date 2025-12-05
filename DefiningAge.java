package guru.com;

import java.util.Scanner;

public class DefiningAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<12) {
			System.out.println("he is kid");
		}else if(age<19) {
			System.out.println("he is Teenager");
		}else if(age<40) {
			System.out.println("he is Youngster");
		}else if(age<55) {
			System.out.println("he is a aged man");
		}else {
			System.out.println("he is a oldman");
		}
sc.close();
	}

}
