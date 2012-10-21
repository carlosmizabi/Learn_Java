package rectangle;

import java.util.Scanner;

public class Rectangle {
	
	
	/*
	 * Write a program that reads the X and Y 
	 * coordinates of two points and then outputs 
	 * the area of a rectangle where both points 
	 * are opposite corners.
	 */


	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
		boolean flag = true;
		while (flag){
		
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the coordinates of 3 points: ");
			
			System.out.println("First point: ");
			int xA = in.nextInt();
			int yA = in.nextInt();
	        
			System.out.println("Second point: ");
			int xB = in.nextInt();
			int yB = in.nextInt();
			
			double area = Math.sqrt((Math.pow((xA - xB), 2)) * (Math.pow((yA - yB) , 2)));
			double x = Math.sqrt((Math.pow((xA - xB), 2)));
			double y = Math.sqrt((Math.pow((yA - yB) , 2)));
			double perimetro = (x + y) * 2;
			
			System.out.println("The area is: " + area);
			System.out.println("The perimeter is: " + perimetro);
			
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