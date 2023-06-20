package Collection;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<>();
		
		a.addAll(Arrays.asList(new Integer[] {1,3,4,8,2,0,9}));
		
		Set<Integer> b = new HashSet<>();
		
		b.addAll(Arrays.asList(new Integer[] {2,5,3,8,0,6}));
		
		 Set<Integer> union = new HashSet<Integer>(a);
	        union.addAll(b);
	        System.out.print("Union of the two Set");
	        System.out.println(union);
	  
	        // To find intersection
	        Set<Integer> intersection = new HashSet<Integer>(a);
	        intersection.retainAll(b);
	        System.out.print("Intersection of the two Set");
	        System.out.println(intersection);
	  
	        // To find the symmetric difference
	        Set<Integer> difference = new HashSet<Integer>(a);
	        difference.removeAll(b);
	        System.out.print("Difference of the two Set");
	        System.out.println(difference);
	

	}

}
