//ASIGNMENT-4
/*Q3. Student
studentId : integer
studentType:char
studentName:String
residentialStatus:String
feesPerMonth: double
Student()
Student(id,type,firstName,lastName)
setStudentId(id:int):void
setStudentType(type:char):void
setStudentName(firstName:String,lastName:String)
setResidentialStatus(status:String)
getStudentId():int
getStudentType():char
getStudentName():String
getResidentialStatus():String
getFees():String
calculateFees(semesterFees:double):void
calculateFees(semesterFees:double,hostelFees:double):void
getStudentName():String
getResidentialStatus():String
getFees():long int
Step 1: Define the calculateFees methods as below:
calculateFees(double semesterFees){
feesPerMonth = semesterFees / 6.0;
}
calculateFees(double semesterFees,double hosterlFees){
feesPerMonth = semesterFees / 6.0;
feesPerMonth = feesPerMonth+ hostelFees;
}
Step 2: Define a main method
a.In the main method, create a reference variable student of type Student.
 b.Create an object of type Student (id, type, firstName, lastName) and assign it to reference
variable named student. c.Invoke setResidentialStatusmethod to set the residentialStatus 
as “Day Scholar” or “Hostelite” d.Check for the residential status, if residential 
status is equals to “Day Scholar”,invoke calculateFees(double semesterFees) method otherwise,
 invoke calculateFees(double
semesterFees, double hosterlFees)
e.Using getter methods, display the student details
Step 3: Compile the program, fix the errors if any
Step 4: Execute the program and verify the output*/
package ASSIGNMENT4;

class Student3 {
	int studentId;
	char studentType;
	String studentName;
	String residentialStatus;
	double feesPerMonth;

	Student3() {
	}

	Student3(int id, char type, String firstName, String lastName) {
		studentId = id;
		studentType = type;
		studentName = firstName + lastName;
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

		Student3 student;
		Student3 s1 = new Student3(69, 'C', "Subhasis", "Sahoo");
		student = s1;
		student.setResidentialStatus("Localite");
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
