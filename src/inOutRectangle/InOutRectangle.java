package inOutRectangle;

import java.util.Scanner;

public class InOutRectangle {

	/*
	 * Write a program that reads the coordinates 
	 * of the two points defining a rectangle and 
	 * then the coordinates of a third point. 
	 * The program must then determine whether the 
	 * point falls inside or outside the rectangle.
	 */
		
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
		boolean flag = true;
		while (flag){
		
			Scanner in = new Scanner(System.in);

			System.out.println("To create a rectangle ");
			System.out.println("Enter the coordinates of 2 points: ");
			
			System.out.println("First point: ");
			int xA = in.nextInt();
			int yA = in.nextInt();
	        
			System.out.println("Second point: ");
			int xB = in.nextInt();
			int yB = in.nextInt();
			
			System.out.println("Now, to check if a point falls inside or \n" +
					"outside of the rectangle \n Enter another point: ");
			int xC = in.nextInt();
			int yC = in.nextInt();
			
			// Check which X is higher
			if ( (xA - xB) > 0 ){
				// is xC greater then xA and smaller then xB
			} else {
				
			}
			
			System.out.println("");
			
			// repeat or exit menu
			flag = exitMenu();
			
			
		} /*XX closes while (flag){} XX*/
		
		System.out.println("Thank you, and Goodbye! ");
		
	} /*XX closes public static void main(String[] args){} XX*/
	
	
	///////////////////////////////////////////////////////////
	// Repeat or Exit menu
	//////////////////////////////////////////////////////////
	public static boolean exitMenu(){
	
		System.out.println("");
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		int menu = 3;
		// while not 0 or 1 ask again
		while ( menu != 0 && menu != 1  ) {
			System.out.println("Would you like to: \n" +
			"Repeat [1] \n" +
			"Exit   [0] \n");
			menu = in.nextInt();
			
			// exit programe
			if ( menu == 0 ){
			return flag = false;
			} 
			}
		return flag;
	} //\\ close method exit ()

} /*XX closes class LetterCount{} XX*/