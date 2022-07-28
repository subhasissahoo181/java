//ASSIGNMENT-3
/*.Q-7 Define a class Student as follows. Data Mambers
studName
studRoll
studMarks[5]
studBranch
studCollegeName
Member Functions
dispStudentDetails()
Define default constructor
Define parameterized constructor
Create an array of 10 student object. Display the details information about the student
who has secured highest average mark.*/

import java.util.*;
class Student
{
	private String studName, studBranch, studCollegeName;
	private int studRoll;
	private int studMarks[] = new int[5];
	Student()
	{
		this.studName = null;
		this.studRoll = 0;
		this.studBranch = null;
		this.studCollegeName = null;
	}
	Student(String studName, int studRoll, int studMarks[], String studBranch, String studCollegeName)
	{
		this.studName = studName;
		this.studRoll = studRoll;
		this.studMarks = studMarks;
		this.studBranch = studBranch;
		this.studCollegeName = studCollegeName;
	}
	void displayStudentDetails(Student s[])
	{
		System.out.println("Student Name : "+s[0].studName);
		System.out.println("Student Roll = "+s[0].studRoll);
		System.out.println("Student Branch = "+s[0].studBranch);
		System.out.println("Student's College Name = "+s[0].studCollegeName);
	}
	double avgMarks(Student s)
	{
		int sum = 0;
		for(int i=0;i<5;i++)
			sum = sum+s.studMarks[i];
		return sum/5.0;
	}
	void sort(Student s[])
	{
		int i, j;
		for (i=1;i<3;i++) 
		{
			Student temp = s[i];
			j = i;
			
            while(j>0 && s[j-1].avgMarks(s[j-1])<temp.avgMarks(temp))
			{
				s[j] = s[j-1];
				--j;
            }
			s[j] = temp;
		}
		s[1].displayStudentDetails(s);
	}
}
public class Studen
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String studName, studBranch, studCollegeName;
	    int studRoll, i, j;
	    int studMarks[] = new int[5];
		Student s[] = new Student[10];
		System.out.println("Enter the student details of 10 students");
		for(i=0;i<3;i++)
		{
			System.out.println("Enter the Name");
		    studName = in.next();
			System.out.println("Enter the Roll No.");
		    studRoll = in.nextInt();
		    System.out.println("Enter the marks secured in 5 subjects");
			for(j=0;j<5;j++)
			{
				studMarks[j] = in.nextInt();
			}
		    System.out.println("Enter the Branch Name");
		    studBranch = in.next();
		    System.out.println("Enter the College Name");
		    studCollegeName = in.next();
			s[i] = new Student(studName, studRoll, studMarks, studBranch, studCollegeName);
		}
		s[1].sort(s);
		
	}
}