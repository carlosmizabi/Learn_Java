package hashUtilities;

import java.util.Scanner;

public class HashUtilities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println ("Give me a string and I will calculate its hash code");
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int hash = str.hashCode();
		//int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + shortHash(hash) + " < 1000");

	}
	
	private static int shortHash(int integer)
	{
		integer = Math.abs(integer);
		
		return integer;
	}

}
