package OOPS;

class Activity{
	// method with 3 parameters
	static int Operation(int a,int b,int c) {
		return a+b+c;
	}
	//method with same name but different number of parameters
	static int Operation(int a , int b) {
		return a*b;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the method
		System.out.println(Activity.Operation(3, 5));
		System.out.println(Activity.Operation(2, 3, 4));

	}

}
