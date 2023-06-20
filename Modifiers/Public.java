package Modifiers;

class B{
	public void display() {
		System.out.println("Public class");
	}
}

public class Public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.display();

	}

}

//output : Public class
