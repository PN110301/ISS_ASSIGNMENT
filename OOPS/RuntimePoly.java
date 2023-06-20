package OOPS;
class Vehicle{
	void move() {
		System.out.println("it can move");
	}
	
}
class Cycle extends Vehicle{
	void move() {
		System.out.println("it can move slow");
	}
}
class Bike extends Vehicle{
	void move() {
		System.out.println("it can move fast");
	}
}
public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a; //creating object of parent class
		a = new Cycle();
		a.move();
		
		a = new Bike();
		a.move();

	}

}
