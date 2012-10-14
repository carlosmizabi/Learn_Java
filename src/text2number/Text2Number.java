package text2number;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Text2Number {

	/*
	 * Write a program that reads a number with commas 
	 * and decimal dots (such as Ò23,419.34Ó) and then 
	 * prints a number that is half of it. Do not use 
	 * Double.parseDouble().
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Take a string in
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String str = in.nextLine();
		
		// get the string length
		int j =  str.length();
		
		boolean floater = false;
		
		// final total
		double result = 0;
		 
		for (int i = 0; i < j; i++){
			
			char x = str.charAt(i);
			if (x == ',' || x == '.'){
				j--;
			}
		}

		// run for every character in string
		for (int i = 0; i < j; i++){
			
			// string to double variable
			double number = -1; 
			// e.g. 20; first character multiply number(2) by 10
			double multiply = 1;
			// find the multiplication factor
			for (int k = (j-i)-1; k > 0; k-- ){
				multiply *= 10;
			}
			
			char x = str.charAt(i);
			
			switch (x){
			
			    case '0': 
					  number = 0; 
					  break;
				case '1': 
					  number = 1;
					  break;
				case '2': 
					  number = 2;
					  break;
				case '3': 
					  number = 3;
					  break;
				case '4': 
					  number = 4;
					  break;
				case '5': 
					  number = 5;
					  break;
				case '6': 
					  number = 6;
					  break;
				case '7': 
					  number = 7;
					  break;
				case '8': 
					  number = 8;
					  break;
				case '9': 
					  number = 9;
					  break;
				case ',':
					  number = -1;
					  break;
				case '.':
			    	  floater = true;
					  break;
				default:
					  break;
			
			}/*XX closes switch(x) XX*/
		
			if (number >= 0  ) {
				result = result + (multiply * number);
		    }else{
				j++;
			}
			
		}/*XX closes for() XX*/	
		DecimalFormat formater = new DecimalFormat("#,###.00");
		if (floater == false){
			System.out.println("This is the result: " + formater.format(result/2));
		}else{
			System.out.println("This is the result: " + formater.format((result/2)/100));
		}
		
	}/*XX closes main() XX*/

}/*XX closes class() XX*/
