package Variables;
// static variable
//public class StaticVar {
//
//	public static int workers = 0; //static variable
//	public String name;
//	
//	public StaticVar(String name) {
//		this.name = name;
//		workers++; //increment the static variable when new department is added
//	}
//
//	public static void main(String[] args) {
//		
//		StaticVar sv = new StaticVar("Admin");
//		System.out.println(StaticVar.workers);
//		
//		StaticVar sv2 = new StaticVar("Finance");
//		System.out.println(StaticVar.workers);
//		
//		StaticVar sv3 = new StaticVar("HR");
//		System.out.println(StaticVar.workers);
//		
//
//	}
//
//}

//Static method use
public class StaticVar {
public static int add(int a , int b) {
	return a+b;
}
public static int multiply(int a , int b) {
	return a*b;
}
public static void main(String args[]) {
	int result = StaticVar.add(5,10);
	System.out.println(result);
	int result1 = StaticVar.multiply(5,10);
	System.out.println(result1);
}
}
