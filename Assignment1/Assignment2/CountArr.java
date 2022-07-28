//ASSIGNMENT2
/* Q-2
Take 20 integer inputs from user and print the following:
Count and display the number of positive integers. 
Count and display the number of negative numbers
Count and display the number of odd numbers
Count and display the number of even numbers
Count and display the number of 0
*/

package Assignment2;
import java.util.Scanner;
public class CountArr {
	public static void main(String args[]) {
		
		//Scanner Sc = new Scanner(System.in);
		//int size = Sc.nextInt();
		//int a[] = new int[size];
		
		int arr[];
		arr=new int[20];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		arr[10]=11;
		arr[11]=12;
		arr[12]=13;
		arr[13]=14;
		arr[14]=15;
		arr[15]=16;
		arr[16]=17;
		arr[17]=18;
		arr[18]=19;
		arr[19]=20;
		
		//for(int i=0; i<=size;i++) {
		for(int i=0; i<=arr.length;i++) {
			System.out.println("The number is"+arr[i]);
			if(i>=0 ) {
				System.out.println("It is positive integer");
				if(i%2==0) {
					System.out.println("odd number.");
				}
				else {
					System.out.println("even number.");
				}
			}
			else {
				System.out.println("It is negative integer");
			}
			
		}
	}
}
