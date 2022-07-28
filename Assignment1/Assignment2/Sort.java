//ASSIGNMENT -2
//Q-4     Write a java program that will sort an array of N numbers.
package Assignment2;
import java.util.Scanner;
public class Sort {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();
		int a[] = new int[size];
		int i, j, k;
		System.out.println("Enter the element of array");
		for(i=0; i<size; i++) {
			a[i]=Sc.nextInt();
			//System.out.print(a[i]+"");
		}
		for(i=0; i<(size-1); i++) {
			for(j=0; j<(size-1-i); j++) {
				if(a[j+1]<a[j]) {
					k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		System.out.println("Shorted elements are.");
		for(i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
