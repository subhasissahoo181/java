
//Compile time Exception.
/*
import java.io.FileInputStream;
class Test{
	public static void main(String args[]){
		try{
			FileInputStream fis =new FileInputStream("s:/java.txt");
			//Class.forName("com.mysql.jdbc.Driver");
		}
		catch( Exception e){
			System.out.println(e);

		}
		System.out.println("hello");
	}
}
/*
import java.io.FileInputStream;
class Exception1{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	}
}


//Runtime Exception

class Test{
	public static void main(String args[]){
		try{
			int a = 100, b=0, c;
		    c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			//System.out.println("Output1")
			System.out.println("Output-1 "+e);
			System.out.println("Output-2"+e.toString());
			System.out.println("Output-3");
			e.printStackTrace();
			System.out.println("Output-4"+e.getMessage());
		}
		
	}
}
/*

//TRY and CATCH


class Test{
	public static void main(String args[]){
		System.out.println("1");
		try{
		System.out.println("2");
		int a= 100, b=10, c;
		System.out.println("3");
		c=a/b;
		System.out.println("4");
		System.out.println(c);
		System.out.println("5");
		}
		catch(ArithmeticException e){
			System.out.println("6");
			System.out.println(e);
		}
		System.out.println("HELLO");
		
	}
}


//HandelError using TRY & CATCH
import java.util.Random;
class HandleError{
	public static void main(String args[]){
		int a=0, b=0, c=0;
		Random r= new  Random();
		for(int i=0; i<32; i++){
			try{
				b=r.nextInt();
			    c=r.nextInt();
			    a=12345/(b/c);
			}
			catch(ArithmeticException e){
				System.out.println("Division by zero.");
			    a=0;
			}
			
			System.out.println("a: "+a);
		}
	}
}
*/

//MULTIPLE CATCH CLAUSE....
class MultiCatch{
	public static void main(String args[]){
		try{
			int a = args.length;
			System.out.println("a  ="+a);
			int b = 42/0;
			int c[] = {1};
			c[42]=99;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0: "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Arry index oob: "+e);
		}
		System.out.println("After try/catch block.");
	}
}