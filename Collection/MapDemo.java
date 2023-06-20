package Collection;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		  
        // Inserting entries in the Map
        // using put() method
        map.put("Ram", 10);
        map.put("Shyam", 30);
        map.put("Tina", 20);
        
        for(Map.Entry<String, Integer> e : map.entrySet()) {
        	
        	//printing key-value pairs
        	System.out.println(e.getKey() + e.getValue());
        }
        
        //----------------------------------------------------------------------------------------
        
        int a[] = { 1, 3,4,8,5,7,3,5,3,23,6,8,3};
        ArrayList<Integer> aa = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }
        HashMap<Integer,Integer> h = new HashMap();
        //count occurrence of numbers
        for (int i = 0; i < aa.size(); i++) {
            h.putIfAbsent(aa.get(i), Collections.frequency(
                                         aa, aa.get(i)));
        }
        System.out.println(h); //{1=1, 3=4, 4=1, 5=2, 6=1, 7=1, 23=1, 8=2}
        

	}

}
