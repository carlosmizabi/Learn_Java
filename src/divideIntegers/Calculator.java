package divideIntegers;

import java.util.Scanner;

public class Calculator {

	/*
	 * Create a Java class called Calculator. 
	 * The class should implement the following methods, each of them printing
	 * the result on the screen.
	 * add(int, int)
	 * subtract(int, int)
	 * multiply(int, int)
	 * divide(int, int)
	 * modulus(int, int)
	 */
	
	
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		System.out.println("CALCULATOR");
		
		Scanner input = new Scanner( System.in);
		
		int menuOpt; // menu opt
		boolean repeat = true;
		
		// repeats as many times as the user wants
		while (repeat == true){
			menuOpt = 0; // second number
			
			// display menu and ask for option
			menuDisplay();
			menuOpt = input.nextInt(); // read menu option
			
			// call and send operation number
			if (menuOpt > 0 && menuOpt < 6){
			menuSwitch(menuOpt);
		
			// Exit or repeat
			repeat = exitMenu();
			}
		}

	} // \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// menuSwitch
	//////////////////////////////////////////////////////////
	public static void menuSwitch(int menuOpt)
	{
		int number1; // first number
		int number2; // second number
		
		Scanner input = new Scanner( System.in);
		
		System.out.print( "Enter first integer: "); // prompt for input
		number1 = input.nextInt(); // read first integer
		
		System.out.print("Enter second integer: "); // promtp for input
		number2 = input.nextInt(); // read second integer
		
		switch (menuOpt){
			case 1:
				System.out.println("\nAddition:");
				add(number1, number2);
				break;
			case 2:
				System.out.println("\nSubtraction:");
				subtract(number1, number2);
				break;
			case 3:
				System.out.println("\nMultiplication:");
				multiply(number1, number2);
				break;
			case 4:
				System.out.println("\nDivision:");
				divide(number1, number2);
				break;
			case 5:
				System.out.println("\nModulus:");
				modulus(number1, number2);
				break;
			default:
				break;
		}
	}// \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// subtract
	//////////////////////////////////////////////////////////
	public static void subtract(int a, int b)
	{
		System.out.println("Hello Sub");
	}// \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// multiply()
	//////////////////////////////////////////////////////////
	public static void multiply(int a, int b)
	{
		System.out.println("Hello mult");
	}// \\\\\\\\\\\\\\\\\\\\\ //

	///////////////////////////////////////////////////////////
	// divide()
	//////////////////////////////////////////////////////////
	public static void divide(int a, int b)
	{
		System.out.println("Hello divide");
	}// \\\\\\\\\\\\\\\\\\\\\ //

	///////////////////////////////////////////////////////////
	// add()
	//////////////////////////////////////////////////////////
	public static void add(int a, int b)
	{
		System.out.println("Hello add");
	}// \\\\\\\\\\\\\\\\\\\\\ //
	
	///////////////////////////////////////////////////////////
	// modulus()
	//////////////////////////////////////////////////////////
	public static void modulus(int a, int b)
	{
		System.out.println("Hello mod");
	}// \\\\\\\\\\\\\\\\\\\\\ //
	
	
	///////////////////////////////////////////////////////////
	// menuDisplay()
	//////////////////////////////////////////////////////////
	public static void menuDisplay()
	{
	
		System.out.println ("\n _____________________ " +
		                    "\n| Menu:               |" +
		                    "\n|_____________________|" +
		                    "\n| Addition........> 1 |" +
		                    "\n| Subtraction.....> 2 |" +
		                    "\n| Multiplication..> 3 |" +
		                    "\n| Division........> 4 |" +
		                    "\n| Modulus.........> 5 |" +
		                    "\n|_____________________|" +
		                    "\n" +
		                    "\nPlease, enter the number of the \nexercise you would like to see... " +
		                    "\n>> ");
		
	} // \\\\\\\\\\\\\\\\\\ //

	///////////////////////////////////////////////////////////
	// Repeat or Exit menu
	//////////////////////////////////////////////////////////
	public static boolean exitMenu()
	{
	
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
	} // \\\\\\\\\\\\\\\\\\ //

}
