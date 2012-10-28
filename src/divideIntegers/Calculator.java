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
		
		while (repeat == true){
			menuOpt = 0; // second number
			
			System.out.print("Enter the operation you would like to do: "); // promtp for input
			menuOpt = input.nextInt(); // read second integer
			
			// call and send operation number
			menuSwitch(menuOpt);
			
		}
		
		// Exit menu
		repeat = exitMenu();

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
				add(number1, number2);
				break;
			case 2:
				subtract(number1, number2);
				break;
			case 3:
				multiply(number1, number2);
				break;
			case 4:
				divide(number1, number2);
				break;
			case 5:
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
