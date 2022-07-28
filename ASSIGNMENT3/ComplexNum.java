/*ASSIGNMENT-3
Q-3 Define a class ComplexNumber, placed the necessary data members and member
functions to perform basic Complex number operation.(Note: the class must have
constructor)*/
import java.util.Scanner;
class Num{
	double real, img;
	
	Num(){
		real=0;
		img=0;
	}
	void display(Num c) {
		System.out.println("The complex number is "+c.real +c.img);
	}
	void sum(Num c1, Num c2) {
		System.out.println("The sum of the complex number is "+(c1.real+c2.real)+(c1.img+c1.img));
	}
	
}
public class ComplexNum {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		Num c1 = new Num();
		Num c2 = new Num();
		System.out.println("Enter the real part amd imaginari part of the first number");
		c1.real=Sc.nextDouble();
		c1.img=Sc.nextDouble();
		System.out.println("Enter the real part and imaginary part of the Second number");
		c2.img=Sc.nextDouble();
		c2.real=Sc.nextDouble();
		c1.display(c2);
		c2.display(c1);
		c1.sum(c1, c2);
		
	}
}
