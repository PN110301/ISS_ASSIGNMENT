package Exceptions;

//user defined exception
class MyException extends Exception{
	//constructor
	public MyException(String s) {
		super(s);
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//throw an object of user defined exception
			throw new MyException("Hello World");
			
		}catch(Exception e) {
			System.out.println("Error");
			
			//prints message from MyException object
			System.out.println(e.getMessage());
		}

	}

}
