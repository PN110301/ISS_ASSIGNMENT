package Exceptions;

//throws is a keyword in Java which is used in the signature of method to indicate 
//that this method might throw one of the listed type exceptions. 
//The caller to these methods has to handle the exception using a try-catch block. 
public class Throws {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
        System.out.println("Hello World");

	}

}
//output : Hello World because interrupted exception is handled using throws keyword