package templates;

import java.util.Scanner;

public class Template {
	
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	boolean flag = true;
	while (flag){
	
		Scanner in = new Scanner(System.in);
		// Get the text
		System.out.println("Enter the text: ");
		String text = in.nextLine();
		text += text;
		
		if ( A > B && B > C) { 
			System.out.println( A + B + C);
		}else{
			System.out.println( C + B + A);
		}
		if ( B > C && C > A) { 
			System.out.println( B + C + A);
		}else{
			System.out.println( A + C + B);
		}
		if ( A > B && B > C) { 
			System.out.println( C + A + B);
		}else{
			System.out.println( B + A + C);
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