//JAVA PACKAGE...
//package program
/*
package p1;
class Prot{
	int n = 1;
	private int nprv = 2;
	private int naft = 3;
}
public class Protection{
	public static void main(String args[]){
		//prot ob = new prot();
		System.out.println("N is"+n);
		System.out.println("N-previous"+nprv);
		System.out.println("N-After"+naft);
	}
	
}*/
//in the above program we do not access the private data of class to other class other wise error occure...

package p1;
public class Protection{
	int n = 1;
	private int nprv = 2;
	private int naft = 3;
	public Protection(){
		System.out.println("In the constructor ");
		System.out.println("N is "+n);
		System.out.println("N-previous"+nprv);
		System.out.println("N-After"+naft);
	}
}