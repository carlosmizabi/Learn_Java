package inheritance;

import java.util.LinkedList;


public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand) {
		super(brand);
	}

	private LinkedList<String> lastTenNumbersList = new LinkedList<String>();
	
	@Override
	public void call(String number) 
	{
		System.out.println("Calling " + number);
		addToList(number);
	} 
	
	public void ringAlarm(String string)
	{
		System.out.println("\nYour ring Alarm is playing!");
		for(int i = 0; i<3; i++)
		{
			System.out.println("..." + string + "...");
			System.out.println("..." + string + "...");
			System.out.println("..." + string + "...");
		}
		System.out.println("You missed a call, bad bad person!\n");
	}
	protected void playGame(String string)
	{
		System.out.println("You are now playing " + string + "\nGood Luck!\n");
	}
	
	public void printLastNumbers()
	{
		System.out.println("The Last 10 numbers Called:\n");
		//System.out.println("get first " + lastTenNumbersList.get(0));
		
		for(int i = 0; i < 10; i++)
		{
			if(lastTenNumbersList.get(i) != null)
			{ 
				System.out.println(lastTenNumbersList.get(i));
			}
		}
	
	}
	
	protected void addToList(String number)
	{
		/**
		 *  1) add new number the head of the list 
		 *  2) remove last number from the tail (10 numbers only)
		 */
		lastTenNumbersList.addFirst(number);
		if (lastTenNumbersList.size() > 10)
		{ 	
			lastTenNumbersList.removeLast(); 
		}
	}
	
	public int sizeOfList()
	{
		if (lastTenNumbersList.isEmpty())
		{
			return 0;
		}
		return lastTenNumbersList.size();
	}
	
	public String lastNumberCalled()
	{
		return lastTenNumbersList.getFirst();
	}

}
