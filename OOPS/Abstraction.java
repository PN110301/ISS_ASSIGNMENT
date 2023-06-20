package OOPS;
//abstract class declared
abstract class Sportsperson{
	private String name;
	
	//constructor
	public Sportsperson(String name) {
		this.name = name;
	}
	public abstract void makemove();
	public String getName() {
		return name;
	}
}
	
	class Cricketer extends Sportsperson{
		public Cricketer(String name) {
			super(name);
		}
		public void makemove() {
			System.out.println(getName() + " hits a ball");
		}
	}
	class Footballer extends Sportsperson{
		public Footballer(String name) {
			super(name);
		}
		public void makemove() {
			System.out.println(getName() + " kicks a ball");
		}
	}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sportsperson cric = new Cricketer("Virat");
		Sportsperson foot = new Footballer("Ronaldo");
		
		cric.makemove();
		foot.makemove();

	}

}
