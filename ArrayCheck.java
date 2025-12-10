package guru.com;

import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int row = sc.nextInt();
		System.out.println("enter the column size");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		sc.close();
		int numbers1to50 = 0;
		int numbers50to100 = 0;
		int numbersabove100 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int num = arr[i][j];

				if (num >= 1 && num <= 50) {
					numbers1to50++;
				} else if (num <= 100) {
					numbers50to100++;
				} else {
					numbersabove100++;
				}
			}

		}
		System.out.println("1 to 50 numbers in array is " + numbers1to50);
		System.out.println("1 to 50 numbers in array is " + numbers50to100);
		System.out.println("1 to 50 numbers in array is " + numbersabove100);
	}

}
