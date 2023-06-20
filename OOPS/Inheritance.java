package OOPS;

//parent class Animal
class Animal{
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}

//child class Dog
//inherits properties of parent class by using extends keyword
class Dog extends Animal{
	public void display() {
		System.out.println("My name is " + name);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog(); //creating object of child class
		dog.name = "Lucky"; //accessing field of parent class
		dog.display();
		dog.eat(); //calling method of parent class and using object of child class
		

	}

}
