package Arrays;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23,7,34,31,39};
		for (int i=0; i<a.length;i++) {
			int flag=0;
			
			for(int j=2;j<a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0)
				System.out.println(a[i] + " is prime number");
			
		}

	}

}
