
/*Q8. Develop a java program that will deal with employee information of an organization. 
 * Define a class Employee, which has the data members and member functions are follows.
 *  Data Mambers empName empNumber basicSal DA HRA Member Functions calGrossSal ( ) showEmpDetails( ) 
 *  Define default constructor Define parameterized constructor Create an array of objects. Display those employees,
 *   whose gross salary is more than 50,000. Note: You are free to add more number of relevant data member and member function.*/
import java.util.*;
class Employee
{
	private String empName;
	private float basicSal, da, hra;
	private int empNumber;
	Employee()
	{
		this.empName = null;
		this.basicSal = 0;
		this.da = 0;
		this.hra = 0;
		this.empNumber = 0;
	}
	Employee(String empName, float basicSal, float da, float hra, int empNumber)
	{
		this.empName = empName;
		this.basicSal = basicSal;
		this.da = da;
		this.hra = hra;
		this.empNumber = empNumber;
	}
	float calGrossSal(Employee e)
	{
		return basicSal+da+hra;
	}
	void showEmployeeDetails(Employee e)
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee No. = "+empNumber);
		float grossSal =calGrossSal(e);
		System.out.println("Gross Salary = "+grossSal);
	}
}
public class EmployeeDriver
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String empName;
	    float basicSal, da, hra;
	    int empNumber;
		System.out.println("Enter the employee details");
		System.out.println("Enter the Name");
		empName = in.next();
		System.out.println("Enter the Employee No.");
		empNumber = in.nextInt();
		System.out.println("Enter the basic salary, DA and HRA");
		basicSal = in.nextInt();
		da = in.nextInt();
		hra = in.nextInt();
	    Employee e = new Employee(empName, basicSal, da, hra, empNumber);
		e.showEmployeeDetails(e);
	}
}
