package overlaps;

import java.util.Scanner;

/*
 * Write a program that reads the coordinates 
 * of four point points, the former two defining 
 * one rectangle and the latter two defining 
 * another one. The program must read the coordinates 
 * of a fifth point and say whether the point
 * is inside both rectangles, inside one of them 
 * only, or out of both.
 */

/*|********************************************************
/*|  Class Point                          
/*|********************************************************/
class Point {
	
	double x;
	double y;
	
} /*|*********************/

/*|********************************************************
/*| Class Rectangle                      
/*|*******************************************************/
class Rectangle {
	
	Point upLeft;
	Point downRight;
	
} /*|*********************/

/*|********************************************************
/*| Class Overlaps                          
/*|*******************************************************/
public class Overlaps {

	///////////////////////////////////////////////////////////
	// >> main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	boolean flag = true;
	while (flag){
		
		// Rectangle ALPHA -----------------------------------------------/
		
		System.out.println("Enter the coordinates for the FIRST rectangle: ");
		
		System.out.println("First point: ");
		Point one = PointCreator();
		
		System.out.println("Second point: ");
		Point two = PointCreator();
		
		// assign to rectangle ALPHA
		Rectangle alpha = RectangleCreator(one, two);
		
		
		// Rectangle BETA -----------------------------------------------/
		System.out.println("Enter the coordinates for the SECOND rectangle: ");
		
		System.out.println("Third point: ");
		Point three = PointCreator();
		
		System.out.println("Fourth point: ");
		Point four = PointCreator();
		
		// assign to rectangle BETA
		Rectangle beta = RectangleCreator(three, four);
		
		// OVERLAPING POINT -----------------------------------------------/
		System.out.println("Enter the coordinates for overlaping point: ");
		System.out.println("Fifth point: ");
		Point five = PointCreator();
		
		// Send Rectangles and point five and 
		// then  Check for overlap
		
		boolean alphaOverlap = OverlapChecker(alpha,five);
		boolean betaOverlap = OverlapChecker(beta,five);
		
		// ?overlaps Both true?
		if (alphaOverlap && betaOverlap){
			System.out.println("The last point overlaps both rectangles.");
		}else if (alphaOverlap){
			System.out.println("The last point overlaps only with the FIRST rectangle.");
		}else if (betaOverlap){
			System.out.println("The last point overlaps only with the SECOND Rectangle.");
		} else{
			System.out.println("The last point doesn't overlap any rectangle.");
		}
		
		// repeat or exit menu
		flag = exitMenu();
	
	
	} /*XX closes while (flag){} */
	
	System.out.println("Thank you, and Goodbye! ");
	
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	
	
	
	///////////////////////////////////////////////////////////
	// Point Creator
	//////////////////////////////////////////////////////////
	public static Point PointCreator(){
		
		Scanner in = new Scanner(System.in);
		Point point = new Point();
		point.x = in.nextDouble();
		point.y = in.nextDouble();
		
		return point;
		
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// Rectangle Creator
	//////////////////////////////////////////////////////////
	public static Rectangle RectangleCreator(Point one, Point two){
		
		Rectangle alpha = new Rectangle(); 
	    alpha.upLeft = one;
	    alpha.downRight = two;
	    
	    return alpha;
	    
	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// OverlapChecker
	//////////////////////////////////////////////////////////
    public static boolean OverlapChecker (Rectangle delta, Point five){
    	
    	    // Catch the Points of delta
	    	Point rectPoint1 = delta.upLeft; 
			Point rectPoint2 = delta.downRight;
			
    		// translate variables
    		double xA = rectPoint1.x;   // delta.UpLeft.x
    		double xB = rectPoint2.x;	// delta.DownRight.x
    		double xC = five.x; 	    // five.x
    		double yA = rectPoint1.y;   // delta.UpLeft.y
    		double yB = rectPoint2.y;   // delta.DownRight.y
    		double yC = five.y;	        // five.y
    		
	    	// counter IF == 2 then INSIDE
			int insideRect = 0;
			// Check which X is higher, if positive then A
			if ( (xA - xB) > 0 ){
				// is xC greater than xB and smaller than xA
				if ( xC > xB && xC < xA) {
					insideRect++;
				}
			}else{ // else negative than B
				// is xC greater than xB and smaller than xA
				if ( xC > xA && xC < xB) {
					insideRect++;
				}
			}
			// Check which Y higher, if positive then A
			if ( (yA - yB) > 0) {
				// is yC greater than yB and Smaller than A
				if ( yC > yB && yC < yA) {
					insideRect++;
				}
			}else{ // else negative than B
				// is xC greater than xB and smaller than xA
				if ( yC > yA && yC < yB) {
					insideRect++;
				}
			}
			
			boolean bool = false;
			// equals to two then it is inside
			if (insideRect == 2){
				bool = true; 
			}
			return  bool;
    } // \\\\\\\\\\\\\\\\\\\\\ //
	
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
		
	} // \\\\\\\\\\\\\\\\\\\\\ //


} /*|*********************/