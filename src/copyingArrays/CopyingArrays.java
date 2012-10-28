package copyingArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrays {

	/*
	 * Create a new Java class called ArrayCopier 
	 * with a method called copy that takes two 
	 * arrays of integers as parameters. The method 
	 * should copy the elements of the first array 
	 * (you can call it src, from ÒsourceÓ) to the second
	 * one (dst, from ÒdestinationÓ) as much as possible.
	 * 
	 * If the second array is smaller, then only 
	 * those elements that fit will be copied. 
	 * If the second array is larger, it will be 
	 * filled with zeroes. 
	 * 
	 * Write a program that creates 
	 * an object of this class and uses this method to 
	 * copy some arrays in all three cases:
	 * 
	 * >> Both arrays are of the same size.
	 * >> The source array is longer.
	 * >> The source array is shorter.
	 */
	
	
	
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	// Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the size of the first array");
	int firstArraySize = in.nextInt();
	
	System.out.print("Enter a list of Integers:");
	
	// first Array
	int[] firstArray = new int[firstArraySize];
	
	// input first array
	int currentSize = 0;
	for (double i : firstArray){ 
		firstArray[currentSize] = in.nextInt();
		currentSize++;
	}
	
	System.out.print("Enter the size of the second list: \n >>");
	
	// reset scanner
	in.reset();
	// size of second array
	int[] second = new int[in.nextInt()];
	
	// create a array object
	ArrayCopier olive = new ArrayCopier(firstArray, second);
	// call the method 
	olive.copy();
	
	
		
	
	}// \\\\\\\\\\\\\\\\\\\ //

}
