package datastructure;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SortStack {
private static void sort(Stack<Integer> input) {
	
	Stack<Integer> tempStack = new Stack<>();
	while(!input.isEmpty()) {
		int elem = input.pop();
		while(!tempStack.isEmpty() && tempStack.peek() > elem) {
				input.push(tempStack.pop());
		}
		tempStack.push(elem);
	}
	ListIterator<Integer> itr = tempStack.listIterator();
	
	//while(itr.hasNext()) {
		//System.out.println(itr.next());
	//}
}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		 Stack<Integer> input = new Stack<>(); 
		    input.push(34); 
		    input.push(3); 
		    input.push(31); 
		    input.push(98); 
		    input.push(92); 
		    input.push(23);
		    sort(input);
		    
		    String base = Base64.getEncoder().encodeToString("hello".getBytes("ascii"));
		    System.out.println(base);
		    
		    sortWithRecursion(input);
		    Iterator<Integer> itr = input.iterator();

		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
	}

	private static Stack<Integer> sortWithRecursion(Stack<Integer> input) {
		
		
		if(!input.isEmpty()) {
			int x = input.pop();
			
			sortWithRecursion(input);
			sort(input,x);
		}
		return input;
	}

	private static void sort(Stack<Integer> input, int x) {

		
		if(input.isEmpty() || input.peek() < x) {
			input.push(x);
			return;
		}
		
		int temp = input.pop();
		sort(input,x);
		input.push(temp);
		
	}
}
