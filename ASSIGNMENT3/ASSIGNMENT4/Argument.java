//ASSIGNMENT-4
//Q4. Write a java program which will have a function, that can take variable numbers of arguments and display it.
package ASSIGNMENT4;

import java.lang.String;

import javax.sql.rowset.spi.SyncResolver;

public class Argument {
	void nameDisplay(String... name) {
		for (String s : name) {
			System.out.print(s);
		}
		System.out.println();
	}

	void rollDisplay(int... roll) {
		for (int x : roll) {
			System.out.print(" ");
			System.out.print(x);
		}
	}

	public static void main(String[] args) {
		Argument v1 = new Argument();
		v1.nameDisplay("My ", "name ", "is ", "SUBHASIS ", "SAHOO");
		v1.rollDisplay(01, 21, 35, 69);
	}

}
