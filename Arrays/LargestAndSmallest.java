package Arrays;
import java.util.*;
public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();		

	}
	int largest = a[0];
	int smallest = a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) largest = a[i];
		if(a[i]<smallest) smallest = a[i];
	}
	System.out.println(largest + " is largest");
	System.out.println(smallest + " is smallest");
	
}
}
