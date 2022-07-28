//ASSIGNMENT-4
/*Q2. Modify the above assignment to get the total number of student objects Static variable and static
method:
Step 1: Add static data member studentCount to store the total number of objects of type Student
Student
studentId : integer
studentType:char
studentName:String
Student()
Student(char sType,String fName,String lName)
displayDetails(Student):void
Step 2: Add static member method getStudentCount () to return the value studentCount. 
Step 3: In default constructor Student(), increment the studentCount by 1 and assign to studentId
Static block:
Step 4: Assign studentCount = 10 (as already 10 students have enrolled)
Step 5: Save and Compile the program, fix the errors if any
Step 6: Execute the program and verify the output
 */
package ASSIGNMENT4;

class Static1 {

}

public class Student2 {
	int studentId;
	char studentType;
	String studentName;
	String residentialStatus;
	double feesPerMonth;

	Student2(){}

	Student2(int id,char type,String firstName,String lastName){
        studentId = id;
        studentType = type;
        studentName = firstName+lastName;
    }

	void setStudentId(int id) {
		this.studentId = id;
	}

	void setStudentType(char type) {
		this.studentType = type;
	}

	void setStudentName(String fn, String ln) {
		this.studentName = fn + ln;
	}

	void setResidentialStatus(String status) {
		this.residentialStatus = status;
	}

	int getStudentId() {
		System.out.println(studentId);
		return studentId;
	}

	char getStudentType() {
		return studentType;
	}

	String getStudentName() {
		return studentName;
	}

	String getResidentialStatus() {
		return residentialStatus;
	}

	double getFees() {
		return feesPerMonth;
	}

	void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}

	void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees / 6.0;
	}

	public static void main(String[] args) {
		Student2 student;
		Student2 s1 = new Student2(4840, 'H', "Tony", " Stark");
		student = s1;
		student.setResidentialStatus("Hostelite");
		if (student.residentialStatus == "Day Scholar") {
			student.calculateFees(70000.0);
		} else {
			student.calculateFees(70000.0, 20000.0);
		}
		System.out.println("Student Id : " + student.getStudentId());
		System.out.println("Student Type : " + student.getStudentType());
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Residential Status : " + student.getResidentialStatus());
		System.out.println("Fees per month : " + student.getFees());

	}
}
