package Basics;

public class Dog {
	int age;
	
	//Defining constructor which has parameter 'name'
	public Dog(String name) {
		System.out.println("Dog name is " + name);
	}
	// defining method class to set age 
	public void setAge(int dogAge) {
		age = dogAge;
	}
	// defining method class to get age
	public int getAge() {
		System.out.println("Dog age is " + age);
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("Lucky");// object creation
		myDog.setAge(5);// calling class method to set age
		myDog.getAge();// calling class method to get age
		

	}

}
