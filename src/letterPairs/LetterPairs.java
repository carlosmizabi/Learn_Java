package letterPairs;

import java.util.Scanner;

public class LetterPairs {
	
	/*
	 * Write a program that reads a short string and 
	 * then some longer text. The program must say 
	 * how many times you can find the short string 
	 * in the text. You cannot use any method of String 
	 * apart from charAt() and length().
	 */

	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		boolean flag = true;
		while (flag){
			
			Scanner in = new Scanner(System.in);
			
			// Get the text
			System.out.println("Enter the long text: ");
			String text = in.nextLine();
			
			// Text length
			int fullText = text.length();
			
			// Get the letter pair
			String letterString = "";
			int stringLength = 0;
			while (stringLength != 2) { 
				System.out.println("Enter a pair of letters: ");
				letterString = in.nextLine();
				stringLength = letterString.length();
			} 
			char letter1 = letterString.charAt(0);
			char letter2 = letterString.charAt(1);
			
			// letter counter
			int letterCount = 0;
			
			// loop through each pair number text char and check for ==
			for (int i = 0; i < fullText; i += 2){
				 
				char workingLetter = text.charAt(i);
				
				if (workingLetter == letter1) {
					
					// loop through each odd number text char and check for ==
					for (int j = 1; j < fullText; j += 2){
						 
						workingLetter = text.charAt(j);
						
						if (workingLetter == letter2) {
							letterCount++;	
							
						}	  	
					}
				}
			 	  	
			}
			
			System.out.println("There is " + letterCount + " pairs of the letters \"" + letter1 + letter2 + "\"");
						
			
			// repeat or exit menu
			flag = exitMenu();
		}
		
		System.out.println("Thank you, and Goodbye! ");

	} /*XX closes public static void main(){} XX*/
	
	
	
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

} /*XX closes class LetterPairs {} XX*/
