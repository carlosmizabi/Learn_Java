package matrix;

public class Matrix {
	
	
	/*///////////////////////////////////////////////////////////
	 * Class Index
	 * 
	 *   # 1 > Matrix(int,int) >> constructor
	 *   
	 *   # 2 > setElement(int,int) >> to modify one element of the array
	 *   
	 *   # 3 > setRow(int,String) that modifies one whole row of the array
	 *    
	 *   # 4 > setColumn(int,String) that modifies one whole column of the array
	 *     
	 *   # 5 > toString() that returns the values in the array as a String
	 *      
	 *   # 6 > prettyPrint() that prints the values of the matrix on screen in a 
	 * 		   legible format
	 * 
	 *////////////////////////////////////////////////////////////
	
	
	///////////////////////////////////////////////////////////
	// 1 | Constructor
	//////////////////////////////////////////////////////////
	/*
	 *  • a constructor method Matrix(int,int) setting the size of the array
	 *  as two integers (not necessarily the same). All elements in the matrix 
	 *  should be initialized to 1.
	 */
	public Matrix(int a, int b)
	{
		
		int[] ab = new int[a];
		int[] bb = new int[b];
		
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 2 | setElement()
	//////////////////////////////////////////////////////////
	/*
	 * • a method setElement(int,int) to modify one element of the array, 
	 * given its position as two integers. The method must check that the indexes 
	 * are valid before modifying the array to avoid an IndexOutOfBoundsException.
	 * If the indexes are invalid, the method will do nothing.
	 */
	private void setElement (int c, int d)
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 3 | setRow()
	//////////////////////////////////////////////////////////
	/*
	 * • a method setRow(int,String) that modifies one whole row of the array, 
	 * given its position as an integer and the list of numbers as a String 
	 * like “1,2,3”. The method must check that the index is valid and the numbers 
	 * are correct (i.e. if the array has three columns, the String contains three 
	 * numbers). If the index or the String is invalid, the method will do nothing.
	 */
	private void setRow(int i, String o)
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// 4 | setColumn()
	//////////////////////////////////////////////////////////
	/*
	 * • a method setColumn(int,String) that modifies one whole column of the array, 
	 * given its position as an integer and the list of numbers as a String like 
	 * “1,2,3”. The method must check that the index is valid and the numbers are 
	 * correct (i.e. if the array has four rows, the String contains four numbers). 
	 * If the index or the String is invalid, the method will do nothing.
	 */
	private void setColumn(int a, String d)
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// 5 | toString()
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
	// 6 | prettyPrint()
	//////////////////////////////////////////////////////////
	/*
	 * • A method prettyPrint() that prints the values of the matrix on screen in a 
	 * legible format. Hint: you can use the special character ’⁀’ to mark a tabulator
	 * so that all numbers are placed in the same column regardless of their size. 
	 * You can think of a tabulator character as a move-to-the-next-column command 
	 * when printing on the screen.
	 */
	public void prettyPrint()
	{
		
	} // \\\\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// ...
	//////////////////////////////////////////////////////////

}
