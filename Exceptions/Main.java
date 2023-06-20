package Exceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]); //trying to access number that does not exist
		    } 
		// it will break try section and goes into catch section
		catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }

	}

}
