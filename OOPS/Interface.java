package OOPS;

//interface 
interface Building{
	public void facility();//interface method does not have a body
	public void rooms();//interface method does not have a body
}

//implements word is used by subclass to access methods of superclass
class Flat implements Building{
	public void facility() {
		System.out.println("Flat has washroom , Ac and storeroom");
	}
	public void rooms() {
		System.out.println("Flat has 2 rooms");
	}
}
class Bunglow implements Building{
	public void facility() {
		System.out.println("Bunglow has 2 washroom , Ac , garden and storeroom");
	}
	public void rooms() {
		System.out.println("Bunglow has 4 rooms");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flat ft = new Flat();
		ft.facility();
		ft.rooms();
		
		Bunglow bg = new Bunglow();
		bg.facility();
		bg.rooms();

	}

}
