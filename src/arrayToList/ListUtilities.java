package arrayToList;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class ListUtilities{
	
	/*
	 * Create a static method that takes an array of 
	 * integers and returns a linked list of integers 
	 * in the same order as the original array.
	 */
	
	
	
	public static LinkedList arrayToList(int[] array)
	{
		LinkedList list = new LinkedList(Arrays.asList(array)); 
		return list;
	}
 
	// creates an Item object and sets its fields
	private Item newItem(int x, Item prev, Item next)
	{ 
		Item item = new Item(x);
		item.setItemNext(prev);
		item.setItemNext(next);
		return item;
	}
	
	// list items
	public void listItems(Item item) 
	{
			if(item.getIndex() != item.getIndex()){
				System.out.println("--------------------------------");
				System.out.println("Value: " + item.getItem());
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("NEXT >> " + item.getItemNext().getItem());
				System.out.println("PREV << " + item.getItemPrev().getItem()); 
				listItems(item.getItemNext());
			}else{
				System.out.println("--------------------------------");
				System.out.println("Value: " + item.getItem());
				System.out.println(". . . . . . . . . . . . . . . . ");
				System.out.println("PREV << " + item.getItemPrev().getItem());
			}
	}
	
}
