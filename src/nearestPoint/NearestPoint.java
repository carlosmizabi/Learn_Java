package nearestPoint;

import java.awt.Point;
import java.util.Scanner;
import java.lang.Math;

public class NearestPoint {

	/*
	 * Write a program that reads the X and Y 
	 * coordinates of three points and then 
	 * outputs which of the three are closer.
	 */
	public static void main(String[] args) {
		 
		boolean flag = true;
		while (flag){
			
			Scanner in = new Scanner(System.in);
		
			System.out.println("Enter the coordinates of 3 points: ");
			
			System.out.println("First point: ");
			int xA = in.nextInt();
			int yA = in.nextInt();
			Point pointA = new Point(xA, yA);
	        
			System.out.println("Second point: ");
			int xB = in.nextInt();
			int yB = in.nextInt();
			Point pointB = new Point(xB, yB);
			
			System.out.println("Third point: ");
			int xC = in.nextInt();
			int yC = in.nextInt();
			Point pointC = new Point(xC, yC);
			
			// Print points
			System.out.println("First point: " + pointA);
			System.out.println("Second point: " + pointB);
			System.out.println("Third point: " + pointC);
			
			/*
			 * create a for loop that takes two points at a 
			 * time and compute their distance
			 */
			
			double dist_A_B = Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
			double dist_B_C = Math.sqrt(Math.pow(xB - xC, 2) + Math.pow(yB - yC, 2));
			double dist_C_A = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
			
			
			System.out.println("A to B: " + dist_A_B);
			System.out.println("B to C: " + dist_B_C);
			System.out.println("C to A: " + dist_C_A);
			
			
			double addThem = dist_A_B + dist_B_C + dist_C_A;
			for (double cookie = 0; cookie < addThem; cookie += 0.001 ){
				 
				if ( dist_A_B > cookie && dist_A_B < (cookie + 0.01)){
					System.out.println("Point A and B are nearest: " + dist_A_B);
					break;
				}
				if (dist_B_C > cookie && dist_B_C < (cookie + 0.01)){
					System.out.println("Point B and C are nearest: " + dist_B_C);
					break;
				}
				if (dist_C_A > cookie && dist_C_A < (cookie + 0.01)){
					System.out.println("Point A and C are nearest: " + dist_C_A);
					break;
				}
			}
			
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

} /*XX closes class NearestPoint{} XX*/
