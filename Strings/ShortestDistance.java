package Strings;

public class ShortestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d1 = -1,d2=-1;
		String[] s = {"russia" , "is" , "the" , "largest", "country"};
		String w1 = "russia" , w2 ="largest";
		int result = Integer.MAX_VALUE;
		//traverse the string
		for(int i=0;i<s.length;i++) {
			if(s[i]==w1) d1=i; //check the word at position i is equal to given word
			if(s[i]==w2) d2=i;
			if(d1!=-1 && d2!=-1) result = Math.min(result, Math.abs(d1-d2));//subtract the positions of both the word and return 
		}
		System.out.println(result);
		

	}

}
