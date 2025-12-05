package guru.com;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int sum = 0;
		        int temporaryVariable = num;

		        while (temporaryVariable != 0) {
		            int digit = temporaryVariable % 10;   
		            sum += digit;           
	temporaryVariable = temporaryVariable / 10;    
		        }
		        System.out.println("Sum of digits is = " + sum);
		        sc.close();
		    }
		}

	


