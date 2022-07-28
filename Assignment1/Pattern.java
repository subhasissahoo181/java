//Asignment 1
//Q9) Write a java program that will print the following patterns 
public class Pattern {
	public static void main(String args[]) {
		int i, j, number, n = 5;
		for (i = 0; i < n; i++) {
			number = 1;
			for (j = 0; j <= i; j++) {

				System.out.print(number + "  ");
				number++;
			}
			System.out.println(" ");
		}
	}

}
			
 
