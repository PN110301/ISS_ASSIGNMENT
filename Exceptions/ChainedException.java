package Exceptions;

public class ChainedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s = null; // the line will throw a NumberFormatException
		int num = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			//create new RuntimeException
			RuntimeException ex = new RuntimeException("Exception");
			//set the cause of new Exception to new NullPointerException
			e.initCause(new NullPointerException("This is the real cause"));
			//throw new Exception with chained Exception
			throw e;
		}
		

	}

}

//output : Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
//at java.base/java.lang.Integer.parseInt(Integer.java:630)
//at java.base/java.lang.Integer.parseInt(Integer.java:786)
//at ISS_Assignment/Exceptions.ChainedException.main(ChainedException.java:9)
//Caused by: java.lang.NullPointerException: This is the real cause
//at ISS_Assignment/Exceptions.ChainedException.main(ChainedException.java:12)
