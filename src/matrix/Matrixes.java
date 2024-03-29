package matrix;

public class Matrixes {

	/*
	 * Create a class Matrix that has a 2-D array of integers as a field. 
	 * The class should have methods for:
	 * 
	 * • a constructor method Matrix(int,int) setting the size of the array
	 *  as two integers (not necessarily the same). All elements in the matrix 
	 *  should be initialized to 1.
	 * 
	 * • a method setElement(int,int) to modify one element of the array, 
	 * given its position as two integers. The method must check that the indexes 
	 * are valid before modifying the array to avoid an IndexOutOfBoundsException.
	 * If the indexes are invalid, the method will do nothing.
	 * 
	 * • a method setRow(int,String) that modifies one whole row of the array, 
	 * given its position as an integer and the list of numbers as a String 
	 * like “1,2,3”. The method must check that the index is valid and the numbers 
	 * are correct (i.e. if the array has three columns, the String contains three 
	 * numbers). If the index or the String is invalid, the method will do nothing.
	 * 
	 * • a method setColumn(int,String) that modifies one whole column of the array, 
	 * given its position as an integer and the list of numbers as a String like 
	 * “1,2,3”. The method must check that the index is valid and the numbers are 
	 * correct (i.e. if the array has four rows, the String contains four numbers). 
	 * If the index or the String is invalid, the method will do nothing.
	 * 
	 * • a method toString() that returns the values in the array as a String 
	 * using square brackets, commas, and semicolons, e.g. “[1,2,3;4,5,6;3,2,1]”.
	 * 
	 * • A method prettyPrint() that prints the values of the matrix on screen in a 
	 * legible format. Hint: you can use the special character ’⁀’ to mark a tabulator
	 * so that all numbers are placed in the same column regardless of their size. 
	 * You can think of a tabulator character as a move-to-the-next-column command 
	 * when printing on the screen.
	 */
	
	public static void main(String[] args) {
		
		int a = 2; // rows
		int b = 3; // columns
		Matrix matrix = new Matrix(a,b);
		
		/* 
		 * {00,01,02}
		 * {10,11,12}
		 */
		matrix.prettyPrint(); 
		
		/*
		String string = " 9,8 ";
		// set element
		matrix.setElement(1,2);
		
		//set row
		matrix.setRow(1,string);
		matrix.prettyPrint();
		
		//set column
		matrix.setColumn(1, string);
		matrix.prettyPrint();
		
		// print it
		System.out.println(matrix.toString());
		
		System.out.println("\n The setMatrix: ");
		*/
		
		//change the all matrix
		String gString = "{11,22,33;44,55,66}";
		String bString = "{11,22,33;44,55,66,8}";
		
		matrix.setMatrix(gString);
		matrix.prettyPrint();
		// display matrix values
		
	}

}
