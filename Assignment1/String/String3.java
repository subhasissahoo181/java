//ASSIGNMENT
/*Q3. Write a JAVA program to read a string from the key board and print its reverse. Sample Output:
Enter a string: shore
Reverse of*/
package String;

import java.lang.String;
import java.io.*;

public class String3 {

	public static void main(String args[]) throws IOException {
		StringBuffer s = new StringBuffer();
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.print("\n Enter the String : ");
		s.append(in.readLine());
		System.out.print("\n Original Name = " + s);
		System.out.print("\n Reverse Name = " + s.reverse());
	}
}
