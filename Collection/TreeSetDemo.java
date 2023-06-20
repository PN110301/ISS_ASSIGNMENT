package Collection;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a NavigableSet object  with 
	      // reference to TreeSet class 
	        NavigableSet<String> ts = new TreeSet<>();
	  
	        // Elements are added using add() method
	        ts.add("Good");
	        ts.add("Morning");
	        ts.add("India");
	  
	         // Printing the elements inside the TreeSet object in alphabetical order
	        System.out.println("Tree Set is " + ts);
	  
	        String check = "Morning";
	  
	        // Check if the above string exists in the treeset or not
	        System.out.println("Contains " + check + " "
	                           + ts.contains(check));
	  
	        // Print the first element in the TreeSet
	        System.out.println("First Value " + ts.first());
	  
	        // Print the last element in the TreeSet
	        System.out.println("Last Value " + ts.last());
	  
	        String val = "India";
	  
	        // Find the values just greater and smaller than the above string
	        System.out.println("Higher " + ts.higher(val));
	        System.out.println("Lower " + ts.lower(val));
	        
	        ts.remove("India");
	        System.out.println(ts); // [Good,Morning]
	        
	        System.out.println(ts.pollFirst()); //Good
	        
	        System.out.println(ts.pollLast()); // Morning
	        
	        Set<String> ts1 = new TreeSet<>();
	        ts1.add("How");
	        ts1.add("are");
	        ts1.add("you");
	        
	     // Now we will be using for each loop in order to iterate through the TreeSet
	        for(String value:ts1) {
	        	System.out.println(value);
	        }
	        System.out.println();
	    

	}

}
