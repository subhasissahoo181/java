//ASSIGNMENT
/*Q1.Create a Package btech which has one class Student. Accept student detail
through parameterized constructor of Student class. Write a method display( ) to
display the student details. Create another class Test containing the main method
which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.*/
// Second class 
package btech;

import btech.Student;
import java.util.Scanner;

public class Derived {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Name : ");
		String name = sc.nextLine();
		System.out.print("\n Enter Roll No. :  ");
		int roll = sc.nextInt();
		System.out.print("\n Enter 3 subject marks : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		// String m3 = sc.nextLine();
		int m3 = sc.nextInt();
		Student s = new Student(roll, m1, m2, m3, name);
		s.Display();
	}
}
