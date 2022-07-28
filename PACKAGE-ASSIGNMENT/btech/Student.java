/*Q1.Create a Package btech which has one class Student. Accept student detail
through parameterized constructor of Student class. Write a method display( ) to
display the student details. Create another class Test containing the main method
which will use the package btech and calculate total marks and percentage of marks. One sample output is shown below.*/
//First class
package btech;

public class Student {

	int roll, m1, m2, m3;
	// String m3;
	String name;

	public Student(int roll, int m1, int m2, int m3, String name) {
		this.roll = roll;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.name = name;
	}

	public void Display() {
		System.out.println("\n ------ Student Details -------");
		System.out.println("\n Name = " + name + "\n Roll No. = " + roll);
		System.out.println("\n Sub 1 = " + m1 + "\n Sub 2 = " + m2 + "\n Sub 3 = " + m3 + "\n ");
		String Percentage = "+(float)(m1+m2+m3)/3)";
	}
}
