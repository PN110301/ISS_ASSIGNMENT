package OOPS;

class Car{
	void move() {
		System.out.println("it can move");
	}
}

class WagonR extends Car{
	//this method overrides move() method of superclass
	@Override void move() {
		System.out.println("it can move and stop");
		
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.move();
		
		Car ob = new WagonR();
		ob.move();
		

	}

}
