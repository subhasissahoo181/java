import java.util.Scanner;

import java.lang.*;

class YoungerAgeException extends Exception {
	YoungerAgeException(String a) {
		super();
	}
}

 class ExceptionDemo {
public static void main(String args[]) {
	Scanner Sc = new Scanner(System.in);
	int a;
	System.out.println("Enter Your Age!");
	a = Sc.nextInt();
	if(a<18) {
		throw new YoungerAgeException("Your Are not Eligible for Voting");
	}
	else{
		System.out.print("You are Now Rligiable for Voting.");
	}
}
}