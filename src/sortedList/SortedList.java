package sortedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SortedList {

	/*
	 * Create a linked list of integers that is automatically sorted.
	 * Everytime you add an element, make sure you introduce it at 
	 * the right place in the queue so that the queue is
	 * always sorted from lower to higher numbers.
	 * Create the list, insert several numbers into it 
	 * (around 15 is fine) and then go through the list printing the value
	 * of each element. Check that the elements are correctly sorted.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] array1 = {9,8,6,5};

		LinkedList<Integer> list = new LinkedList<Integer>();
		list = ListUtilities.array2List(array1);
		 
		ListUtilities.print(list);
		
		ListUtilities.add(list, 7);
		ListUtilities.print(list);
		 
		 
	}

}
