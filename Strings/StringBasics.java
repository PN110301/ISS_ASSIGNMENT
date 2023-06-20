package Strings;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Information";
		System.out.println("The length is " + str.length()); // length() method finds length of the string
		// output : the length is 11
		
		String txt = "Hello World";
		// toUpperCase() converts string to Capital letters
		System.out.println(txt.toUpperCase());   // Output "HELLO WORLD"
		// toLowerCase() converts strings to small letters
		System.out.println(txt.toLowerCase());	 // Output "hello world"
		
		
		String txt2 = "Russia is the largest country in the world";
		// indexOf() returns the position of first occurrence of the text
		System.out.println(txt2.indexOf("largest")); //Output is 14
		
		
		String str1 = "Hello sir, ";
		String str2 = "My name is John";
		// concat() method combines two strings
		System.out.println(str1.concat(str2)); // output: Hello sir, My name is John
		
		
		String str3 = "John    ";
		System.out.println(str3.trim()); //trim() method removes the whitespaces.
		System.out.println(str3.startsWith("J")); // returns boolean value true
		System.out.println(str3.endsWith("h")); // returns boolean value false
		System.out.println(str3.charAt(2)); // returns the character at position 2
		System.out.println(str3.replace("John","Johny"));//replaces all occurrences of John with Johny
		
		
	}

}
