package arrayList;

import java.util.Scanner;

public class ArrayList {
	
	/*
	 * Write a small program that asks for the names 
	 * and IDs of all employees in a small company, and
	 * store them in an array of integers and an array 
	 * of Strings. The company has 10 employees.
	 * Use a loop to go through both arrays and print 
	 * the names and IDs of those employees whose 
	 * ID is less than 1000. Use another loop to print 
	 * the names and IDs of those employees whose name
	 * starts with ÒJÓ or ÒSÓ.
	 */

	
	public static void main(String[] args) {
		
		//Scanner in
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		
		// Total employees
		int totalEmp = 10;
		
		String [] empName;
		empName = new String [totalEmp];
		int [] empNum;
		empNum = new int [totalEmp];
		
		System.out.println("Please enter the name and id of the "+ totalEmp +" employees");
		
		// Add employees (name and id)
		for (int i = 0; i < totalEmp; i++){
			
			System.out.print("Next employee Name: \n>> ");
			empName[i]= in.nextLine(); 
			
			System.out.print("Next employee ID Number: \n>> ");
			empNum[i]= in1.nextInt();
			
			System.out.println("Emp: " + empName[i] + "\n with ID: " + empNum[i]
					+ "\n Has been added!\n");	
		}
		
		System.out.println("\nEmployees with ID smaller than 1000:");
		// none flag
		boolean none = true;
		for (int j = 0; j < totalEmp; j++){
			if(empNum[j] < 1000){
				System.out.println(empName[j] + " ID:" + empNum[j]);
				none = false;
			}
		}
		
		if (none == true) System.out.println("NONE");
		// reset none flag for next condition
		none = true;
		
		System.out.println("\nEmployees whose name starts with ÒJÓ or ÒSÓ:");
		for (int k = 0; k < totalEmp; k++){
			
			// Get string and uppercase it
			String temp = empName[k].toUpperCase();
			// get the first char
			char x  = temp.charAt(0);
						 
			if(x == 'J' || x == 'S'){
				System.out.println(empName[k]);
				none = false;
			}
		}
		if (none == true) System.out.println("NONE");
		
		// emp list
		System.out.println("\nEmployee List: ");
		for (int l = 0; l < totalEmp; l++){
		
			System.out.println("Emp: " + empName[l] + " | ID: " + empNum[l]);
			
		}
		
		System.out.println("\nThank you, Goodbye!");
	}

}
