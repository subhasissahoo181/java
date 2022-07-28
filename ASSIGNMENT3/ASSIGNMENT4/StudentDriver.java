//ASSIGNMENT-4
/* Q1.Write a java program based on the following requirements.
Step 1: Define a class Student and define two constructors. Default constructor: Used to increment the value of studentId for each objects of Student
class. studentId should start from 550. Parameterized constructor: Constructor with three arguments StudentType(H/D),
firstName and lastName
studentName=firstName+lastName
displayDetails (Student obj):Should accept the object as an argument and display the details
like studentId, studentType, studentName of that object
Step 2: Define a main method. In the main method
Create an object of Student(‘D’,”Bony”,”Thomas”) and assign it to
reference variable studentOne;
Call the displayDetails() method and display the details of studentOne
Create an object of Student(‘H’,”Dinil”,”Bose”) and assign it to
reference variable studentTwo;
Call the displayDetails() method and display the details of studentTwo
Step 3: Compile the program, fix the errors if any
Step 4: Execute the program and verify the output
 * */

package ASSIGNMENT4;

class Student
{
    private int studentId;
    private char studentType;
    private String studentName;
    Student()
    {
        this.studentId = 550;
        studentId++;
    }
    Student(char sType, String fName, String lName)
    {
        this.studentType = sType;
        this.studentName = fName+" "+lName;
    }
    void displayDetails(Student s)
    {
        System.out.println("Student Id : "+s.studentId);
        System.out.println("Student Type : "+s.studentType);
        System.out.println("Student Name : "+s.studentName);
    }
}
public class StudentDriver
{
    public static void main(String args[])
    {
        Student s1 = new Student('D',"Bony","Thomas");
        s1.displayDetails(s1);
        Student s2 = new Student('H',"Dinil","Bose");
        s2.displayDetails(s2);
    }
}


