package Exceptions;

import java.io.*;

public class Example {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        //e.printStackTrace();
        //This method prints exception information in the format of Name of the exception: description of the exception, stack
        //output: java.lang.ArithmeticException: / by zero at ISS_Assignment/Exceptions.Example.main(Example.java:10)
        
        //System.out.println(e.toString());
        //This method prints exception information in the format of Name of the exception: description of the exception.
        //output: java.lang.ArithmeticException: / by zero
        
        System.out.println(e.getMessage());
        //This method prints only the description of the exception.
        //output: / by zero
      }
    }
}
