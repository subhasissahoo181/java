
/* ASSIGNMENT-3
Q2. Define a class Box, having basic data members and member function. Write a Driver
class that create Box objects and compute the volume of the Box
*/
import java.util.Scanner;
class Box{
	double length, breath, height;
	double volume(Box b){
		return b.length*b.breath*b.height;
	}
	
}
public class BoxDriver {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		Box b= new Box();
		System.out.println("Enter the length of the Box");
		b.length=Sc.nextDouble();
		System.out.println("Enter the width of the Box");
		b.breath=Sc.nextDouble();
		System.out.println("Enter the height of the Box ");
		b.height=Sc.nextDouble();
		
		double volume;
		volume= b.volume(b);
		System.out.println("The volume of the Box is ="+volume);
	}
}
