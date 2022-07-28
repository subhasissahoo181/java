//ASSIGNMENT-2
//Q-7 Write a java program that will randomly generate 100 numbers and stored in an array, then it compute the mean and standard deviation
package Assignment2;
import java.util.Random;
public class RandomNum {
	public static void main(String[] args) {
		  int max = 100;
		  int min = 1;
		// create instance of Random class
		  Random randomNum = new Random();
		  int showMe = min + randomNum.nextInt(max);
		  System.out.println("The random number is "+showMe);
		}
}
