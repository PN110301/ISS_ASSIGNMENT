package Collection;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		q.add("pen");
		q.add("paper");
		q.add("pencil");
		System.out.println(q); //[pen, paper, pencil]
		
		//remove() returns the removed element
		System.out.println(q.remove()); //pen
		
		System.out.println(q);// [paper, pencil]
		
		System.out.println(q.peek()); //paper
		
		System.out.println(q.size()); //2
		

	}

}
