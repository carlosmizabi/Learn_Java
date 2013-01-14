package inheritance;

public class PhoneLauncher {
	
	public static void main(String[] args) 
	{
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() 
	{
	// your code creating and using SmartPhone here...
		// 
		//
		
		System.out.println("How Smart are you SmartPhone?:\n");
		
		MobilePhone fone = new SmartPhone("Apple");
		fone.call("01");
		fone.call("02");
		fone.call("003");
		fone.call("04");
		fone.call("05");
		fone.call("006");
		fone.call("07");
		fone.call("08");
		fone.call("009");
		fone.call("10");
		fone.call("11");
		
		fone.printLastNumbers();
		
		fone.ringAlarm("trimm!");
		((SmartPhone) fone).browseWeb("google");
		fone.playGame("chess");
		System.out.println("Gps position: " + ((SmartPhone) fone).findPosition());
		
		System.out.println("This is a " + fone.getBrand() + " Smartphone.");
		
	}
}
