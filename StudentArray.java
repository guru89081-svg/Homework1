package guru.com;

import java.util.Scanner;

class StudentArray {
    String name;
    int age;
    int marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // clear newline

        StudentArray[] students = new StudentArray[n];

       
        for (int i = 0; i < n; i++) {
            students[i] = new StudentArray();

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Age: ");
            students[i].age = sc.nextInt();

            System.out.print("Marks: ");
            students[i].marks = sc.nextInt();
            sc.nextLine();  // clear newline
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name  : " + students[i].name);
            System.out.println("Age   : " + students[i].age);
            System.out.println("Marks : " + students[i].marks);
        }

        sc.close();
    }
}