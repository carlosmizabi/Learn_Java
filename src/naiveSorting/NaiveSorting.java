package naiveSorting;

import java.util.Scanner;

public class NaiveSorting {

	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	boolean flag = true;
	while (flag){
	
		Scanner in = new Scanner(System.in);
		// Get the text
		System.out.println("Enter the 3 numbers: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double added = a+b+c;
		for (int cookie = 0; cookie < added; cookie++){
			
			if (a == cookie) 
				System.out.println(a);
			
			if (b == cookie) 
				System.out.println(b);
			
			if (c == cookie) 
			System.out.println(c);
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

} /*XX closes class NaiveSorting{} XX*/