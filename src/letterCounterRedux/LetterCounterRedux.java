package letterCounterRedux;

import java.util.Scanner;

public class LetterCounterRedux {

	/*
	 * Write a program that reads a text from the 
	 * user and then enter a loop of requesting letters 
	 * and counting them. The program stops if the user 
	 * asks for the same letter twice.
	 */
	public static void main(String[] args) {
		
		boolean flag = true;
		while (flag){
			
			Scanner in = new Scanner(System.in);
			
			// Get the text
			System.out.println("Please write a text: ");
			String text = in.nextLine();
			
			// Text length
			int fullText = text.length(); 
			
			String checkedLetters = "";
			boolean noRepeat = true;
			while (noRepeat) {
			
				/*
				 * each letter entered must be added to a new string (checkedLetters)
				 * a for loop must then go through the string and check 
				 * if the letter was already there
				 */
				
				
				// Get the letter
				System.out.println("Which letter would you like to count now? ");
				String letterString = in.nextLine();
				char theLetter = letterString.charAt(0);
				
				// Go through every letter already entered
				int checkedLettersLenght = checkedLetters.length();
				for (int j = 0; j < checkedLettersLenght; j++){
					
					char workingString = checkedLetters.charAt(j);
					
					if (workingString == theLetter) {
						noRepeat = false;
						System.out.println("Repeated character. Exiting the program...");
						break;
					} 
				}
				
				// add letter to checkedString
				checkedLetters = checkedLetters + theLetter;
				
				// letter counter
				int letterCount = 0;
				
				// loop through each text char and check for ==
				for (int i = 0; i < fullText; i++){
					 
					char workingLetter = text.charAt(i);
					
					if (workingLetter == theLetter) {
						letterCount++;
					}
				 	  	
				}
				
				if (noRepeat != false){
					System.out.println("There was " + letterCount + " letter \"" + theLetter + "\"");
				}
				
			} /*XX closes while (noRepeat){} XX*/
			// repeat or exit menu
			flag = exitMenu();
			
		} /*XX closes while (flag){} XX*/
		
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
	} /*XX closes public static boolean exitMenu(){} XX*/

} /*XX closes class LetterCounterRedux {} XX*/