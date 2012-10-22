package overlaps;

import java.util.Scanner;

///////////////////////////////////////////////////////////
// Class Point
//////////////////////////////////////////////////////////
class Point {
	double x;
	double y;
}
///////////////////////////////////////////////////////////
// Class Rectangle
//////////////////////////////////////////////////////////
class Rectangle {
	Point upLeft;
	Point downRight;
}

public class Overlaps {

	/*
	 * Write a program that reads the coordinates 
	 * of four point points, the former two defining 
	 * one rectangle and the latter two defining 
	 * another one. The program must read the coordinates 
	 * of a fifth point and say whether the point
	 * is inside both rectangles, inside one of them 
	 * only, or out of both.
	 */
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	boolean flag = true;
	while (flag){
		
		// Create the points
		PointCreator();
		
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
	
	
	///////////////////////////////////////////////////////////
	// PointCreator
	//////////////////////////////////////////////////////////
	public static void PointCreator (){
		
		Scanner in = new Scanner(System.in);
		
		// Create five points
		Point one = new Point();
		Point two = new Point();
		Point three = new Point();
		Point four = new Point();
		Point five = new Point();
		
		System.out.println("Enter the coordinates for the FIRST rectangle: ");
		
		System.out.println("First point: ");
		one.x = in.nextDouble();
		one.y = in.nextDouble();
        
		System.out.println("Second point: ");
		two.x = in.nextDouble();
		two.y = in.nextDouble();
		
		System.out.println("Enter the coordinates for the SECOND rectangle: ");
		
		System.out.println("Third point: ");
		three.x = in.nextDouble();
		three.y = in.nextDouble();
		
		System.out.println("Fourth point: ");
		four.x = in.nextDouble();
		four.y = in.nextDouble();
		
		System.out.println("Enter the coordinates for overlaping point: ");
		
		System.out.println("Fifth point: ");
		five.x = in.nextDouble();
		five.y = in.nextDouble();
		
		
	} /*XX closes PointCreator{} XX*/
	
	///////////////////////////////////////////////////////////
	// Rectangle Creator
	//////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////
	// OverlapChecker
	//////////////////////////////////////////////////////////
	

} /*XX closes class Overlaps{} XX*/