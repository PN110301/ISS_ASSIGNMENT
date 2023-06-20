package OOPS;

 class Person{
	//private String name;
	 public String name;
	
	public String getName() {
		 return name;
	 }

 public void setName(String newName) {
	 this.name = newName;
 }
 
 }
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myObj = new Person();
		
		//if the variable declared was public we would be able to access it
//	    myObj.name = "John";  // error
//	    System.out.println(myObj.name); // error 
		
		myObj.name = "John";
		System.out.println(myObj.name); // John is given as output

	}

}
