package Exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5 , c =5, res=0;
		try {
			res = a /(b-c);
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("Exception: / by zero");
		}
		//finally block is executed irrespective of the exception
		finally {
			System.out.println("Recheck the variables");
		}

	}

}
