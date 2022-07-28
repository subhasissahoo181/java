//Assignment 1
//Q5)Write a java program that will compute GCD and LCM of two inputted numbers.
import java.util.Scanner;
public class GcdLcm {
	public static void main(String args[]) {
		int a,b, gcd=0,lcm=0;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the Two number");
		a=Sc.nextInt();
		b=Sc.nextInt();
		for(int i=1; i<=a&&i<=b; i++) {
			if(a%i==0&&b%i==0)
				
			{
				gcd=i;
				
			}
			
		}
		lcm=(a*b)/gcd;
		System.out.println("The GCD is ="+gcd);
		System.out.println("The LCM is ="+lcm);
		
	}
}
