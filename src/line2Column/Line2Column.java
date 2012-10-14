package line2Column;
import java.util.Scanner;

/*
 *  Write a program that reads some text from the
 *   user and then writes the same text on screen,
 *    but each letter on a different line.
 * 
 */

public class Line2Column {

	///////////////////////////////////////////////////////////
	// Main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		boolean flag = true;
		while (flag){
		
			
			Scanner in = new Scanner(System.in);
			int options = 0;
		    // while not 0 or 1 ask again
			while ( options != 2 && options != 3  ) {
			    System.out.println("Would you to try a: \n" +
			    		            "Word       [2] \n" +
			    		            "Sentence   [3] \n");
				options = in.nextInt();
				if (options == 2){
					word();
				} else {
					sentence();
				}
			} 
			
		    flag = exitMenu();
			
		} //\\ close while (flag) //\\
		
		System.out.println("Thank you, Goodbye!");
			
	} //\\ close main //\\
	
	///////////////////////////////////////////////////////////
	// word()
	//////////////////////////////////////////////////////////
	public static void word(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String str = in.nextLine();
		int j =  str.length();
		
		for (int i = 0; i < j; i++){
			
			char x = str.charAt(i);
		    System.out.println(x);
		}
		
	} //\\ Close Method word(); //\\
	
	///////////////////////////////////////////////////////////
	// sentence() 
	//////////////////////////////////////////////////////////
	public static void sentence(){
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String str = in.nextLine();
		int fullSentence =  str.length();
		
		for (int i = 0; i < fullSentence; i++){
			
			char x = str.charAt(i);
		    System.out.print(x);
		    if (x ==' '){
		    	System.out.println("");
		    }
		}
		
	} //\\ Close Method sentence(); //\\
	
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
	
} //\\ close class //\\