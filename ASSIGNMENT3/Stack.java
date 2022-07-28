/*ASSIGNMENT-3
Q6. Define a class Stack, which has the member function to perform basic operation of
stack. Define another driver class to demonstrate the basic operation */
import java.util.*;
class Stack1{
	int size=100;
	int top;
	int a[] = new int[size];
	
	Stack1() {
		top = -1;
	}
	void push(int s) {
		if(top>=(size-1)) {
			System.out.println("Stack Overflow.");
		}
		else {
			a[++top]=s;
			System.out.println(s+"push in teh array.");
		}
	}
	int  pop() {
		if(top>0) {
			System.out.println("The stack is Underflow.");
			return 0;
		}
		else {
			int s=a[top--];
			return s;
		}
	}
	void display() {
		System.out.println("The Current Stack is");
		for(int i=top; i>0; i--) {
			System.out.println(a[i]+" ");
		}
	}
}
public class Stack {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		Stack1 Ob1 = new Stack1();
		int choice =0;
		while(choice!=4)
		{
			System.out.println("1-Push\n2-Pop\n3-Display\n4-Exit");
			System.out.println("Enter your choice");
			choice = Sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the element to be pushed");
				int ele = Sc.nextInt();
				Ob1.push(ele);
				break;
				case 2:
				System.out.println(Ob1.pop() + " Popped from stack"); 
				break;
				case 3:
				Ob1.display();
				break;
				case 4:
				return;
				default:
				System.out.println("Wrong choice");
			}
		}
	}
}
