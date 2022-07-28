//ASSIGNMENT-
//Q2. Write a java program which handle multiple 
package ExceptionHandling;

public class Exception2 {
	public static void main(String[] args) {
		int a = 3, b = 3;

		int arr[] = new int[4];

		try {
			int c = a - b / 0;
			System.out.println(c);
			System.out.println(arr[5]);
			String str = null;
			System.out.println(str.charAt(0));
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (NullPointerException e) {
			System.out.println(e);

		}

		//catch (Exception e) {
			//System.out.println(e);
		//}
	}

}
