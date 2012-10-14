package palindrome;

import java.util.Scanner;

public class Palindrome {
	
	/*
	 * Write a program that reads a text and 
	 * detects whether the text is a strict palindrome.
	 */

	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		boolean flag = true;
		while (flag){
			
			Scanner in = new Scanner(System.in);
			int options = 0;
		    // while not 0 or 1 ask again
			while ( options != 2 && options != 3  ) {
			    System.out.println("Menu: \n" +
			    		            "Palindrome Check   [2] \n" +
			    		            "Palindrome Creator [3] \n");
				options = in.nextInt();
				if (options == 2){
					palChecker();
				} else {
					palCreator();
				}
			} 
	
			
		flag = exitMenu();	
		}
		
	} //\\ closes main() //\\
	
	///////////////////////////////////////////////////////////
	// palindromeChecker()
	//////////////////////////////////////////////////////////
	public static void palChecker(){
		
		boolean palindrome = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String str = in.nextLine();
		int fullSentence =  str.length();
		// integer division, remainder is discarded
		int firstHalf = (fullSentence / 2);
		
		
		int j = fullSentence;
		for (int i = 0; i < firstHalf; i++){
			 
			char up = str.charAt(i);
			char down = str.charAt(j-1);
		    if (up != down){
		    	palindrome = false;
		    	break;
		    }
		    j--;   	
		}
		if (palindrome == false){
			System.out.println( "This isn't a palindrome. ");
		}else{
			System.out.println( "Great! This is a palindrome. ");
		}
		
	}//\\ Close palChecker() //\\
	
	///////////////////////////////////////////////////////////
	// palindromeCreator()
	//////////////////////////////////////////////////////////
	public static void palCreator(){
		
		 Scanner in = new Scanner(System.in);
			
			System.out.println("Enter a Sentence: ");
			String str = in.nextLine();
			
			int fullSentence =  str.length();
			
			System.out.println("Here is your palindrome ");
			System.out.print(str);
			for (int i = (fullSentence); i > 0 ; i--){

				char x = str.charAt(i-1);
			    System.out.print(x); 
			    
			}
			System.out.println();
	
	}//\\ Close palCreator() //\\
	
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

}
