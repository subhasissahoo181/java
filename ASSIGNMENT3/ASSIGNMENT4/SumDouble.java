//ASSIGNMENT
//Q6. Write a program that will take some double type of data as command line arguments and perform sum of the numbers
package ASSIGNMENT4;

import java.util.Scanner;

public class SumDouble {

    public static void main(String[] args){
    	SumDouble s = new SumDouble();
    	int[] array = { };
    	double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        System.out.println("Enter integer a : "+args[0]);
        System.out.println("Enter integer b : "+args[1]);
        System.out.println(array[0] + " + " + array[1] + " = " );
       // double sum = a+b;
        //System.out.println("Sum of numbers is : "+sum);

    }
    
}



		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (i == j)
					continue;
				if (array[i] + array[j] == num) {
					System.out.println(array[i] + " + " + array[j] + " = " + num);
				}
			}
		}*/