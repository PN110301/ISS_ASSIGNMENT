package Exceptions;

//The flow of execution of the program stops immediately after the throw statement is executed and 
//the nearest enclosing try block is checked to see if it has a catch statement that matches the type of exception. 
//If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked and so on. 
//If no matching catch is found then the default exception handler will halt the program. 
public class Throw {
	static void fun() {
		try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	        {
	            fun();
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("Caught in main.");
	        }

	}

}

//output : Caught inside fun()
         // Caught in main()
