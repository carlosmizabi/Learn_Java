package inheritance;

public class SmartPhone extends MobilePhone{
	
	public SmartPhone(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call(String number)
	{
		/**
		 *  1)  if the first two numbers are zero then
		 *  2)  print this message
		 *  3) else use the super.call(number);
		 */
		if (checkIfIsInternational(number) == true)
		{
			System.out.println("Calling " + number +  " through the internet to save money");
			super.addToList(number);
		} else {	
		 super.call(number);
		}
	}
	
	private boolean checkIfIsInternational(String number)
	{
		if( number.charAt(0) == '0' & number.charAt(1) == '0')
		{
			return true;
		}
		return false;
	}
	
	public void browseWeb(String string)
	{
		System.out.println("\nYou are now browsing the web with: " + string + "\n");
	}
	
	public String findPosition()
	{
		// Fake GPS position
		//
		return "N37-43.69, W97-28.39";
	}

}
