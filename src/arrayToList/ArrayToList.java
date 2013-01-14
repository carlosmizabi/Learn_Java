package arrayToList;

import java.util.*;


public class ArrayToList {

	/*
	 * Create a static method that takes an array of 
	 * integers and returns a linked list of integers 
	 * in the same order as the original array. 
	 * 
	 * You can put this method in a class called ListUtilities so
	 *  that you can easily use it for the following exercises.
	 *  
	 *  Initialising an array with 15-20 elements is 
	 *  very easy with curly-brackets-notation, so 
	 *  it is common to create an array and then convert 
	 *  it into a dynamic structure automatically.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Integer[] array1 = {9,8,7,6};

		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(array1)); 
		 
		 for(int i : list1){
			 System.out.println("List: " + i);
		 }
		 
		 // add
		 list1.add(40);
		 // peek
		 System.out.println("first: " + list1.peek());
		 System.out.println("last: " + list1.peekLast());
		 System.out.println("first: " + list1.peekFirst());
		 // remove first
		 list1.pop();
		 list1.set(3, 9);
		 for(int i : list1){
			 System.out.println("List: " + i);
		 }
		 
	}

}
