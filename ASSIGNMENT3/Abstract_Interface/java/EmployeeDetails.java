//ASSIGNMANT-5 -INHETITANCE
/* Q1.Define a class Employee having basic data members empName, empID and empSal, with
constructors and necessary member functions. Define a class Manager which is inherited
from Employee class and having a data member bonus. Define the driver class that create
object of the class Manager and access */
package Abstract_Interface.java;

class Employee {
	String empName;
	int empID;
	double empSal;

	Employee() {
		empName = " ";
		empID = 0;
		empSal = 0.0;
	}

	Employee(String n, int id, double sal) {
		empName = n;
		empID = id;
		empSal = sal;
	}

	void Display() {
		System.out.println(empName + "\t" + empID + "\t" + empSal);
	}
}

class Manager extends Employee {
	double bonus;

	Manager() {
		super();
		bonus = 1000.0;
	}

	Manager(String n, int id, double sal, double b) {
		super(n, id, sal);
		bonus = b;
	}

	void Display() {
		System.out.println(empName + "\t" + empID + "\t" + empSal + "\t" + bonus);
	}
}

public class EmployeeDetails {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Subhasis", 1001, 21000);
		System.out.println("\n Employee Details : ");
		System.out.println("Name " + "\t" + "ID" + "\t" + "Salary");
		e2.Display();
		Manager m1 = new Manager();
		Manager m2 = new Manager("Chandan ", 1002, 30000, 2000);
		System.out.println("\n Manager Details : ");
		System.out.println("Name " + "\t" + " ID" + "\t" + "Salary" + "\t" + "Bonus");
		m1.Display();
		m2.Display();
	}
}
