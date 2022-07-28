
import java.io.FileInputStream;
class Exception{
	public static void main(String args[]){
		try{
			FileInputStream fis =new FileInputStream("c:/java.txt");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
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
*/
