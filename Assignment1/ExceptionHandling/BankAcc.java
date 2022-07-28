//ASSIGNAMENT
/*
 Q4. Define a class called BankAccount with the following properties and methods:
Properties: String accName, int accNum, double accBalance
Methods:
void deposit(int amt)
void withdraw(int amt), void transfer (BankAccount acc1, BankAccount acc2, int amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is made to
withdraw or transfer, which results in balance going below 500, throw a user defined exception
called MinimumBalanceException. Use throw and throws wherever necessary. Note: Your code must have user defined exception.
 */
package ExceptionHandling;

import java.util.*;
class BankAccount
{
	private int accountNumber;
	private String accHolderName, accType;
	private double accBalance;
	BankAccount()
	{
		this.accountNumber = 0;
		this.accHolderName = "Name";
		this.accBalance = 0.0;
		this.accType = "Savings";
	}
	BankAccount(int accountNumber, String accHolderName, double accBalance, String accType)
	{
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.accType = accType;
	}
	void withdraw(double amount)
	
	{
		
		if(amount<=accBalance)
			this.accBalance = accBalance-amount;
		else
			System.out.println("Insufficient Balance");
		this.displayAccountDetails();
	}
		
	void deposit(double amount)
	{
		this.accBalance = accBalance+amount;
		this.displayAccountDetails();
	}
	void displayAccountDetails()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accHolderName);
		System.out.println("Account Balance : "+accBalance);
		System.out.println("Account Type : "+accType);
	}
}
public class BankAcc
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int accountNumber, choice=0, amount;
	    String accHolderName, accType;
	    double accBalance;
		System.out.println("Enter the bank details");
		System.out.println("Enter the Account Number");
		accountNumber = in.nextInt();
		System.out.println("Enter the Account Holder's Name");
		accHolderName = in.next();
		System.out.println("Enter the Account Balance");
		accBalance = in.nextDouble();
		System.out.println("Enter the Account Type");
		accType = in.next();
		BankAccount b = new BankAccount(accountNumber, accHolderName, accBalance, accType);
		while(choice != 3)
		{
		System.out.println("Enter 1 to withdraw /nEnter 2 to deposit /nEnter 3 to exit");
		choice = in.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter the amount");
			amount = in.nextInt();
			b.withdraw(amount);
			break;
			case 2:
			System.out.println("Enter the amount");
			amount = in.nextInt();
			b.deposit(amount);
			break;
			case 3:
			return;
			default:
			System.out.println("Wrong choice");
		}
		}
	}
}


/*

class MinimumBlanaceException extends BankAcc.	      
MinimumBlanaceException(String str){
              super(str);

          }
      }

class BankAcc {

	int accNumber;
	String accHolderName;
	int accBalance;
	String accType;
	static String bankName = "State bank of India";

	BankAcc() {
		accNumber = 0;
		accHolderName = null;
		accBalance = 0;
		accType = null;
	}

	BankAcc(int number, String name, int balance, String type) {
		this.accNumber = number;
		this.accHolderName = name;
		this.accBalance = balance;
		this.accType = type;
	}

	void deposit(int d) {
		if (d > 0) {
			accBalance = accBalance + d;
		} else {
			System.out.println("Invalid transaction");
		}
	}

	void withdrawal(int w) throws MinimumBlanaceException {
		if (accBalance - w < 500) {
			throw new MinimumBlanaceException(
					"your account balance will deducted to less than 500 so we can't procced this transaction");
		}

		if (w > 0 && w <= accBalance) {
			accBalance = accBalance - w;
		} else {
			System.out.println("Invalid transaction");
		}
	}

	void display() {
		System.out.println("Ac. HolderName = " + accHolderName);
		System.out.println("Ac. No. = " + accNumber);
		System.out.println("Ac. Balance = " + accBalance);
		System.out.println("Ac. Type = " + accType);
		System.out.println("Name of the bank = " + bankName);
		System.out.println();
	}
}

public class number4 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(123456, "Gohan", 20000, "Savings");
		b1.display();
		b1.deposit(10000);

		try {
			b1.withdrawal(30000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}*/
