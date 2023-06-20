package DecisionControl;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if(number<0) {
			System.out.println("The number is negative");
		}else {
			System.out.println("The number is positive");
		}

	}

}
