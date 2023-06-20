package Basics;

class Cats{
	String breed;
	String size;
	int age;
	String color;


public String info() {
	return ("Breed is " + breed + '\n' + " Size is " + size + '\n' + " Age is " + age + '\n' + " Color is " + color);
	
}
}
public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats cat = new Cats();
		cat.breed = "Kitten";
		cat.size = "large";
		cat.age = 5;
		cat.color = "brown";
		
		System.out.println(cat.info());

	}

}

