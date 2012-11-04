package doWhile;

import java.util.Scanner;


/*
 * Make a class that implements a method that reads a 
 * list of marks between 0 and 100 from the user, one per line,
 * and stops when the user introduces a -1. The program should 
 * output at the end (and only at the end) how many
 * marks there were in total, how many were distinctions (70Ð100), 
 * how many were passes (50Ð69), how many failed (0Ð49), and how 
 * many were invalid (e.g. 150 or -3). Use readLine() exactly once. 
 * The output may look similar
 * to this example:
 * Input a mark: 13
 * Input a mark: 45
 * Input a mark: 63
 * Input a mark: 73
 * Input a mark: 101
 * Input a mark: 45
 * Input a mark: 18
 * Input a mark: 92
 * Input a mark: -1
 * There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).
 */
public class DoWhile {
	
	///////////////////////////////////////////////////////////
	// main()
	//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		marksAverage();
	}
	
	
	public static void marksAverage()
	{
		
		Scanner in = new Scanner(System.in);
		int i;
		int j = 0;
		int mark = 0;
		// [0]fails, [1]passes, [2]distinctions
		int[] marks = {0,0,0};
		
		System.out.println("Enter the marks: ");
		do {
			
			String name = in.nextLine();
			i = Integer.parseInt(name);	
			if(i > -1)
			{
				j++;
				mark += i;
				if(i >= 70) marks[2]++;
				if(i > 70 && i >= 50) marks[1]++;
				if(i < 50) marks[0]++;
			}
		} while (i > -1);
		
		System.out.println("There was: \n" +
				marks[2] +   " Distinctions\n" +
				marks[1] +   " Passes\n" +
				marks[0] +   " Fails");
		System.out.println("The average grade was: \n" + (mark/j));
	}
}

