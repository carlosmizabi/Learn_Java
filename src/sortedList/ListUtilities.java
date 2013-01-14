package sortedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class ListUtilities {

	
	public static LinkedList<Integer> array2List(Integer[] array)
	{
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(array));
		Collections.sort(list);
		return list;
	}
	
	public static void add(LinkedList<Integer> list, int n)
	{
		list.add(n);
		Collections.sort(list);
	}
	
	public static void print(LinkedList<Integer> list)
	{
		for(int i : list){
			 System.out.println("List: " + i);
		 }
	}
}
