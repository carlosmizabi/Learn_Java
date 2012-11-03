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
	 *  # 8 > int[] stringToArray(String,String) takes a string checks 
	 *  	  format converts to int[] and returns it 
	 *  
	 *  # 9 > setMatrix(String) - modifies a whole matrix
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

		if (valid == true){
			System.out.println("The current value of Array Element [" + rows + 
					"][" + columns + "]\n" + " = " +
					array[rows][columns]
					);
			// if valid set element
		
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
			
			int []validArray = stringToArray(string, "ROW");
			if(validArray[0] == 1)
			{
				// v System.out.println("initiated if(validArray)");
				
				for(int i = 0; i < array[0].length; i++)
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
	public void setColumn(int column, String string)
	{
		// rows validity sentinel - check row
		boolean validColumn = validCall(0,column);
		
		// v System.out.println("The row length is: " + array[rows].length);
		
		// if valid set element
		if (validColumn)
		{
			// v System.out.println("initiated if(validRow)");
			
			int []validArray = stringToArray(string, "COLUMN");
			if(validArray[0] == 1)
			{
				// v System.out.println("initiated if(validArray)");
				
				for(int i = 0; i < array.length; i++)
				{
					array[i][column] = validArray[i+1];
				}
			}
		}
		/*// Check values
		 * for(int i = 0; i < array[rows].length; i++){
			System.out.print(array[rows][i] + " | ");
		}*/
		
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
		
	    String string = "[";
	    String temp;
	    int rowSize = 0;
	    int colSize = 0;
	    
		for (int i = 0; i < array.length; i++)
		{
			rowSize++;
		
			for (int j = 0; j < array[i].length; j++){
				colSize++;
				string += array[i][j];
				
				if((colSize + rowSize) < (array[0].length + array.length))
				{
					if (colSize != array[0].length){
						string += ",";
					}else{
						string += ";";
						colSize = 0;
					}
			
				}
			}
			
		}
		string += "]";
		
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
		System.out.println("");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("");
			for (int j = 0; j < array[i].length; j++){
				System.out.print("\t" + array[i][j]);
			}
		}
		System.out.println("");
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// 8 | stringToArray
	//////////////////////////////////////////////////////////
	/*
	 * >> Takes a int objID which identifies the row 
	 */
	public int[] stringToArray(String string, String which){
		// remove white space at start and end
		string = string.trim();
		int arraySize = 0;
		boolean invalid = false;
		
		
		// make the string upper case
		which = which.toUpperCase();
		if (which.equals("ROW"))
		{
			// get the length of the array row (num of columns)
			arraySize = array[0].length;
		}else if (which.equals("COLUMN")){
			// get the length of the array columns (num of rows)
			arraySize = array.length;
		}else{
			// set to invalid
			invalid = true;
		}
		
		// set valid array plus one for condition
		// the first position of the array [0] classifies
		// the string as either valid (1) or not valid (0)
		int[] valid = new int[arraySize + 1];
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
						
						// v System.out.println("itemCount = " + intCount);
						// are the number of items within array size?
						// if yes assign it else then invalid exit
						if (intCount <= arraySize+1){
							
							// v System.out.println("INIT:  are the number of items within array size?");
							// parse char to int '0' = 48 and '9' = 57
							// v System.out.println("itemCount = " + intCount);
							valid[intCount] = (x - 48);

							 // v System.out.println("valid[" + (intCount) + "] =" + valid[intCount] );
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
		if(string.length() > ((arraySize)*2-1) || invalid){
			valid[0] = 0;
		}
	
		//check the values
		/*/ for(int i = 0; i < valid.length; i++){
			System.out.print(valid[i] + " | ");
		}
		*/
		
		
		return valid;
	} // \\\\\\\\\\\\\\\\\\\\\\\ //

	///////////////////////////////////////////////////////////
	// 9 | setMatrix()
	//////////////////////////////////////////////////////////
	/*
	 * a method setMatrix(String) that takes a String 
	 * representing the numbers to be put in the elements 
	 * of the array separated by commas, separating rows by 
	 * semicolons, e.g. 1,2,3;4,5,6;7,8,9.
	 */
    public void setMatrix(String string)
    {
    	/* Conditions:
    	 * at the end of a row there must be a semicolon
    	 * each number must be proceeded by a comma
    	 * it must be of the same size as the array
    	 * 
    	 * must convert from string to int
    	 * take the array apart row by row and ask if valid
    	 * use valid call
    	 */
    	
    	// arraySize
    	int arraySize = array.length * array[0].length; 
    	// the array to hold all converted values
    	int[] arrayMule = new int[arraySize];
    	// valid?
    	boolean valid = true;
    	
    	// check if string starts and ends properly
    	if (string.charAt(0) == '{' &&  string.charAt(string.length()-1) == '}')
    	{
    		// now remove start and end characters "{}"
    		string = string.substring(1, string.length()-1);
    	}else{
    		valid = false;
    	}
    	
    	// if not a number or a comma or semicolon = invalid
    	if (valid == true)
    	{	
    		for(int i = 0; i < string.length(); i++)
    		{
    			char x = string.charAt(i);
    			// v System.out.println(" char: " + x);
    			if ((x != ',' && x != ';') && (x < '0' || x >'9'))
    			{
    				valid = false;
    				break;
    			}
    		}
    	}
    		
    	if (valid == true)
    	{
    		// v System.out.println("Happy Days!");
    		// v System.out.println(string);
    		
    		// variables 
    		int substringCount = 0;	 // create substrings up to comma
    		String subString = "";
    		int itemCount = 0; 	    // item counter > at end must have same size as arraySize
    		int prevSub = 0; 		// hold the previous value
    		int rowCounter = 0; 	// row counter counts items up to the ;
    		
    		for(int i = 0; i <= string.length()-1; i++)
    		{
    			// get char
    			char x = string.charAt(i);
    			// count char
    			substringCount++;
    			
    			// semicolon condition
    			if(x == ';'){
    				if(rowCounter != array[0].length-1)
    				{ // if not equal to num of column
    					valid = false;
	    				break;
    				}else{
    					rowCounter = 0;
    				}
    			}
    			
    			if(x == ',' || x == ';' || i == string.length()-1)
    			{
    				// set the subString up to comma 
    				if (i != string.length()-1)
    				{
    					subString = string.substring(prevSub, substringCount-1);
    				}else //if end of string adjust
    				{
    					subString = string.substring(prevSub, substringCount);
    				}
    				// convert string to an integer
    				int temp = stringToInt(subString);
    			    // v System.out.println("Current tem value = " + temp);
    				
    			    prevSub = substringCount;
    			    itemCount++;
    			    rowCounter++;
    			    
    			    
    			    // only assign if within bounds
    			    if (itemCount <= arraySize)
    			    {
	    			    // assign value to arrayMule
	    			    arrayMule[itemCount-1] = temp;
    			    }else{
    			    	// not valid stop
    			    	valid = false;
    			    	break;
    			    }
    			    
    			}
    		}
    	}
    	
    	// if still valid then assign
		if(valid == true)
		{
    		// assign arrayMule to array
		    int arrayMuleCount = 0;
			for (int i = 0; i < array.length; i++)
			{
				for (int j = 0; j < array[i].length; j++)
				{
					array[i][j] = arrayMule[arrayMuleCount];
					arrayMuleCount++;
					//System.out.println(" | " + array[i][j]);
				}
			}
		}
    }
	///////////////////////////////////////////////////////////
	// 9 | stringToInt()
	//////////////////////////////////////////////////////////
	/*
	* takes a string and returns a integer
	*/
	private int stringToInt(String string)
	{
		int converted = 0;
		
		//now lets converts the string to a number
	    int temp = 0;
	    for (int j = 0; j <= string.length()-1; j++)
	    {
	    	char y = string.charAt(j);
	    	int t = y - 48;
	    	t = (int) (t * Math.pow(10, ((string.length()-1) - j)));
	    	converted += t;	
	    }
		
		return converted;
	}
	
} //******************************************************//
