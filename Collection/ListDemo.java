package Collection;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of list interface using Arraylist class
		List<String> li = new ArrayList<>();
		
		//adding elements using add() method
		li.add("Good");
		li.add("morning");
		li.add("India");
		
		System.out.println(li); //output : [Good, morning, India]
		
		li.add(1,"evening");
		System.out.println("Initial list " + li); //output : [Good,evening, morning, India]
		
		//updating element at first index using set()
		li.set(1, "night");
		System.out.println("Final list " + li); //output: [Good,night, morning, India]
		
		li.remove(1);// removes element at specified index
		System.out.println("After index removal " + li); //output : [Good, morning, India]
		li.remove("India"); //removes the specified object
		System.out.println("After object removal " + li); //output : [Good, morning]
		
		//get() method returns the element at specifies index
		System.out.println(li.get(1)); // output : morning
		
		boolean isPresent = li.contains("morning"); //contains() checks whether element is present in the list or not
		System.out.println(isPresent); // output : true
	//------------------------------------------------------------------------------------------------------------------
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		int index = al.indexOf(1); // gives the first occurrence
		System.out.println("The first occurrence is at index " + index); //output: The first occurrence is at index 0
		int lastIndex = al.lastIndexOf(1); //gives the last occurrence
		System.out.println("The last occurrence is at index " + lastIndex);//output : The first occurrence is at index 2

	}

}
