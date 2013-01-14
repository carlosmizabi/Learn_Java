package tests;

public class Bill {
	
	private String concept;
	private int amount;
	private Bill next;
	private static int counter = 0;
	
	public Bill(String concept, int amount) 
	{
		this.concept = concept;
		this.amount = amount;
		next = null;
		counter++;
	}
	public int getCounter()
	{
		return counter;
	}
	public String getConcept() 
	{
		return concept;
	}
	public int getAmount() 
	{
		return amount;
	}
	public void setNextBill(Bill bill) 
	{
		next = bill;
	}
	public Bill getNextBill() 
	{
		return next;
	}
}