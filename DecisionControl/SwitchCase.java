package DecisionControl;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		int n1=20 , n2=5 , result;
		//takes input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator from '+','-','*','/' ");
		operator = sc.next().charAt(0);
		//switch operator 
		switch(operator) {
		case '+' :
			result = n1+n2;
			System.out.println(result);
			break;
		
		case '-' :
			result = n1-n2;
			System.out.println(result);
			break;
		
		case '*' :
			result = n1*n2;
			System.out.println(result);
			break;
		
		case '/' :
			result = n1/n2;
			System.out.println(result);
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		
	
	}
		sc.close();

	}

}
