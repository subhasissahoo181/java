//ASSIGNMENT-3
/*Q5. Write a java program that will create class BankAccount. Data Mambers
      accontNumber
      accHolderName
      accBalance
      accType
      Member Functions
      withdraw( )
      deposit( )
      displayAccountDetails( )
      Define default constructor
      Define parameterized constructor
      Define a driver class that accesses all members of the class */

//import java.util.Scanner;
class Account{
	int accountNumber;
	String accHolderName;
	int accBalance;
	String accType;
	static String bankName ="STATEBANK OF INDIA ";
	Account(){
		accountNumber=0;
		accHolderName=null;
		accBalance=0;
		accType=null;
	}
	Account(int accNum, String accName, int accBal, String accType){
		this.accountNumber=accNum;
		this.accHolderName=accName;
		this.accBalance=accBal;
		accType=accType;
	}
	void withdraw(int w) {
		if(w>0 && w<accBalance) {
			accBalance=accBalance-w;
		}
		else {
			System.out.println("Invalide Transaction");
		}
	}
	void deposit(int d) {
		if(d>0) {
			accBalance=accBalance+d;
		}
		else {
			System.out.println("Invalide Transaction");
		}
	}
	void displayAccountDetails(){
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Account Holder name is "+accHolderName);
		System.out.println("Account Balance is "+accBalance);
		System.out.println("Invalide Transaction"+accType);
	}
}
public class Bank {
	public static void main(String args[]) {
		Account ob1 = new Account(123456,"SUBHASIS SAHOO", 10000,"Saving");
		ob1.displayAccountDetails();
		ob1.deposit(1000);
		ob1.displayAccountDetails();
		ob1.withdraw(2500);
		ob1.displayAccountDetails(); 
	}
}
