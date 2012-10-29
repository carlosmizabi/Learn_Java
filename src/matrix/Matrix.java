package matrix;

import java.util.Scanner;

public class Matrix {
	
	
	private int[][] array;
	
	/*///////////////////////////////////////////////////////////
	 * Class Index
	 * 
	 *   # 1 > Matrix(int,int) >> constructor
	 *   
	 *   # 2 > validCall(int,int) >> checks integers as valid array coordinate
	 *   
	 *   # 3 > setElement(int,int) >> to modify one element of the array
	 *   
	 *   # 4 > setRow(int,String) that modifies one whole row of the array
	 *    
	 *   # 5 > setColumn(int,String) that modifies one whole column of the array
	 *     
	 *   # 6 > toString() that returns the values in the array as a String
	 *      
	 *   # 7 > prettyPrint() that prints the values of the matrix on screen in a 
	 * 		   legible format
	 * 
	 *  # 8 > int[] stringToArray(int String) takes a string checks 
	 *  	  format converts to int[] and returns it
	 * 
	 *////////////////////////////////////////////////////////////
	
	
	///////////////////////////////////////////////////////////
	// 1 | Constructor
	//////////////////////////////////////////////////////////
	/*
	 *  >> a constructor method Matrix(int,int) setting the size of the array
	 *  as two integers (not necessarily the same). All elements in the matrix 
	 *  should be initialized to 1.
	 */
	public Matrix(int a, int b)
	{
		// 2-D Array
		array = new int[a][b];
		
		/* Array model:
		 * 	{*,*,...}
		 * 	{*,*,...}
		 */
		
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 2 | validCall
	//////////////////////////////////////////////////////////
	/*
	 *  >> method receives two integers and check if they are
	 *  a valid array coordinate 
	 */
	private boolean validCall(int rows, int columns)
	{
		// validity sentinel
		boolean valid = false;
		
		// check if (rows) fits the array
		if (rows <= array.length && rows >= 0){
			// check if (columns) fits the array
			if(columns <= array[0].length && columns >= 0 ){
				valid = true;
			}
		}
		
		return valid;
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 3 | setElement()
	//////////////////////////////////////////////////////////
	/*
	 * >> a method setElement(int,int) to modify one element of the array, 
	 * given its position as two integers. The method must check that the indexes 
	 * are valid before modifying the array to avoid an IndexOutOfBoundsException.
	 * If the indexes are invalid, the method will do nothing.
	 */
	public void setElement(int rows, int columns)
	{
		// validity sentinel - check row and column
		boolean valid = validCall(rows,columns);

		System.out.println("The current value of Array Element [" + rows + 
				"][" + columns + "]\n" + " = " +
				array[rows][columns]
				);
		// if valid set element
		if (valid){
			System.out.println("The value to insert: ");
			Scanner in = new Scanner(System.in); 
			int newValue = in.nextInt();
			
			array[rows][columns] = newValue;
			
			System.out.println("The value of Array Element [" + rows + 
					"][" + columns + "]\n" + "has been changed to " +
					array[rows][columns]
					);
			
		}
		
	} // \\\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 4 | setRow()
	//////////////////////////////////////////////////////////
	/*
	 * >> a method setRow(int,String) that modifies one whole row of the array, 
	 * given its position as an integer and the list of numbers as a String 
	 * like “1,2,3”. The method must check that the index is valid and the numbers 
	 * are correct (i.e. if the array has three columns, the String contains three 
	 * numbers). If the index or the String is invalid, the method will do nothing.
	 */
	public void setRow(int rows, String string)
	{
		
		// rows validity sentinel - check row
		boolean validRow = validCall(rows,0);
		
		// v System.out.println("The row length is: " + array[rows].length);
		
		// if valid set element
		if (validRow)
		{
			// v System.out.println("initiated if(validRow)");
			
			int []validArray = stringToArray(rows, string);
			if(validArray[0] == 1)
			{
				// v System.out.println("initiated if(validArray)");
				
				for(int i = 0; i < array.length; i++)
				{
					array[rows][i] = validArray[i+1];
				}
			}
		}
		/*// Check values
		 * for(int i = 0; i < array[rows].length; i++){
			System.out.print(array[rows][i] + " | ");
		}*/
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// 5 | setColumn()
	//////////////////////////////////////////////////////////
	/*
	 * >> a method setColumn(int,String) that modifies one whole column of the array, 
	 * given its position as an integer and the list of numbers as a String like 
	 * “1,2,3”. The method must check that the index is valid and the numbers are 
	 * correct (i.e. if the array has four rows, the String contains four numbers). 
	 * If the index or the String is invalid, the method will do nothing.
	 */
	private void setColumn(int a, String d)
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 6 | toString()
	//////////////////////////////////////////////////////////
	/* 
	 * • a method toString() that returns the values in the array as a String 
	 * using square brackets, commas, and semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.
	 */
	public String toString()
	{
		String string = "";
		return string;
	}// \\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 7 | prettyPrint()
	//////////////////////////////////////////////////////////
	/*
	 * >> A method prettyPrint() that prints the values of the matrix on screen in a 
	 * legible format. Hint: you can use the special character ’⁀’ to mark a tabulator
	 * so that all numbers are placed in the same column regardless of their size. 
	 * You can think of a tabulator character as a move-to-the-next-column command 
	 * when printing on the screen.
	 */
	public void prettyPrint()
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// 8 | stringToArray
	//////////////////////////////////////////////////////////
	/*
	 * >> “1,2,3” 
	 */
	public int[] stringToArray(int rows, String string)
	{
		// remove white space at start and end
		string = string.trim();
		
		// get the length of the array
		int arraySize = array[rows].length;
		
		// set valid array plus one for condition
		// the first position of the array [0] classifies
		// the string as either valid (1) or not valid (0)
		int[] valid = new int[arraySize + 1];
		
		// v System.out.println("valid length " + valid.length);
		
		int intCount = 0;
		int totalCount = 0;
		if (string.length() > 1){
			
			
			// v System.out.println("INIT: if (string.length() > 2");
			
			// iterate over each character of the string
			for (int i = 0; i < string.length(); i++){
				
				// v System.out.println("INIT: for (int i = 0; i < string.length(); i++)");
				
				char x = string.charAt(i);
				
				// v System.out.println("CHAR X = " + x);
				
				// if number or a comma proceed else invalid
				if ((x >= '0' && x <= '9') || x == ','){
					
					// v System.out.println("INIT: if number or a comma proceed else invalid");
					
					// if not a comma then it is a number proceed
					if( x != ','){
						
						// v System.out.println("INIT: if( x != ',')");
						
						// since it is a number increase itemCount
						intCount++;
						
						// v System.out.println("itemCount = " + itemCount);
						// are the number of items within array size?
						// if yes assign it else then invalid exit
						if (intCount <= arraySize+1){
							
							// v System.out.println("INIT:  are the number of items within array size?");
							// parse char to int '0' = 48 and '9' = 57
							// v System.out.println("itemCount = " + intCount);
							valid[intCount] = (x - 48);

							// v System.out.println("valid[" + (itemCount) + "] =" + valid[itemCount] );
							// validity assignment
							valid[0] = 1;
							// v System.out.println("valid[0] =" + valid[0] );
						}else{
							// validity assignment
							valid[0] = 0;
							// v System.out.println("else valid[0] =" + valid[0] );
							break;
						}
					}
					
					
				}else{
					// validity assignment
					valid[0] = 0;
					break;
				}
				
			}
		}
		// if trimmed string is greater than the ((row size * 2) - 1) (commas)
		// then it is invalid
		if(string.length() > ((array[rows].length)*2-1)){
			valid[0] = 0;
		}
	
		//check the values
		/* for(int i = 0; i < valid.length; i++){
			System.out.print(valid[i] + " | ");
		}
		*/
		
		
		return valid;
	} // \\\\\\\\\\\\\\\\\\\\\\\ //

}
