package tests;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;

public class AccountingTest {

	/**
	* The first element of the list of bills
	*/
	private Bill firstBill = null;
	
	@Test
	public void testLink() {
		
		
		//if (fst.)
		//int output = 4;
		//int expected = 3;
		//assertEquals(output, expected);
	}
	
	@Test
	public void testCount() {
		
		String concept = "";
		int amount = 0;
		do {
			
			System.out.println("What’s your next bill (type \"END\" to finish)?");
			System.out.print(" Concept: ");
			Scanner in = new Scanner(System.in);
			concept = in.nextLine();
			
			if (!concept.equals("END")) 
			{
				System.out.print(" Amount: ");
				String strAmount = in.nextLine();
				amount = Integer.parseInt(strAmount);
				Bill newBill = new Bill(concept, amount);
				addBillToList(newBill);
			}
			
			
		} while (!concept.equals("END"));
		
		System.out.println("Number od Nodes: " + firstBill.getCounter());
		int count = 0;
		int totalDebt = 0;
		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
			totalDebt += current.getAmount();
		}
		System.out.println("You have " + count + " bills unpaid (total debt: " + totalDebt + ")");
	}
	
	private void addBillToList(Bill bill) 
	{
		if (firstBill == null) 
		{
			firstBill = bill;
			return;
		}
		Bill current = firstBill;
		while (current != null) 
		{
			if (current.getNextBill() == null) 
			{
				current.setNextBill(bill);
				return;
			}
			current = current.getNextBill();
		}
		return;
	}

}
