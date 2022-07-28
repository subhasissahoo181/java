//ASSIGNMENT-4
//Q6. Write a program that will take some double type of data as command line arguments and perform sum of the numbers
package ASSIGNMENT4;

 class SumDoubl {
	 int args[];
	    public static void main(String args[]){
	        System.out.println("Enter integer a : "+args[0]);
	        System.out.println("Enter integer b : "+args[1]);
	        double a = Double.parseDouble(args[0]);
	        double b = Double.parseDouble(args[1]);
	        double sum = a+b;
	        System.out.println("Sum of numbers is : "+sum);

	    }
	    
	}
