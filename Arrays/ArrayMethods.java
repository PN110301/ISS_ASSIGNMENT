package Arrays;
import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"Jan","feb","march"};
		String a1[] = {"Jan","feb","march"};
		System.out.println(a.length); //returns the length of array
		List<String> a_list = Arrays.asList(a); //converts string array to list
		System.out.println(a_list);
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, 1)));// copies the original array into new one depending on the specified length
		
		System.out.println(Arrays.equals(a, a1)); //returns boolean value by considering both arrays 
		
		int numarray[] = {23,43,12,56,32};
		Arrays.sort(numarray);
		System.out.println(Arrays.toString(numarray));
		
		int key =56;
		//call binary search function to find the given key 
		System.out.println("Key " + key + " found at index = " + Arrays.binarySearch(numarray, key));
		
		
		Arrays.fill(numarray, 1); // fills the array with specified value by replacing other values
		System.out.println(Arrays.toString(numarray));
		
		Arrays.sort(numarray); //sorts the array in ascending order
		System.out.println(Arrays.toString(numarray));

	}

}
