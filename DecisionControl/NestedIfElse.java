package DecisionControl;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=102,b=101,c=102;
		if(a>=b) {
			if(a>=c) {
				System.out.println("A is largest");
			}else {
				System.out.println("C is largest");
			}
		}else {
			if(b>=c) {
				System.out.println("B is largest");
			}else {
				System.out.println("C is largest");
			}
		}

	}

}
