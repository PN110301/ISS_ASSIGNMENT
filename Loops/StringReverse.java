package Loops;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		str = sc.nextLine();
		
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		

	}

}
