package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malayalam" , reverse = "";
		int len = str.length();
		for(int i= len-1;i>=0;i--) {
			reverse = reverse + str.charAt(i); //append the characters at position i into reverse variable
		}
		if(str.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}

	}

}
