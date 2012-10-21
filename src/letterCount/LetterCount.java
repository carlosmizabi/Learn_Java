package letterCount;

import java.util.Scanner;

public class LetterCount {
	
	/* 
	 * Write a program that reads some text from the user and 
	 * then says how many letters ’e’ are there in that text.
	 * Then modify the program so that it reads the text from 
	 * the user and then asks for a letter. The program should
	 * then say how many times you can find the letter in the text
	 */

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
			
			// Text length
			int fullText = text.length();
			
			// Get the letter
			System.out.println("Now enter the letter: ");
			String letterString = in.nextLine();
			char theLetter = letterString.charAt(0);
			
			// letter counter
			int letterCount = 0;
			
			// loop through each text char and check for ==
			for (int i = 0; i < fullText; i++){
				 
				char workingLetter = text.charAt(i);
				
				if (workingLetter == theLetter) {
					letterCount++;
				}
			 	  	
			}
			
			System.out.println("There was " + letterCount + " letter \"" + theLetter + "\"");
			
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
