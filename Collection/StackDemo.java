package Collection;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<5;i++) {
			stack.push(i); //place elements at top of the stack
		}
		System.out.println(stack); //output : [0, 1, 2, 3, 4]
		
		
		System.out.println(stack.peek()); //peek() displays the top element i.e: 4
		
		//pop() removes the top element
		stack.pop(); // removes 4
		stack.pop(); // removes 3
		System.out.println(stack); // output : [0,1,2]
		
		
		

	}

}
