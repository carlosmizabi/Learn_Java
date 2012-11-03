package instanceCounter;



	public class Spy 
	{
		
	private static int spyCount = 0;
	public int spyID;
	
	public Spy(int spyID) 
	{
		this.spyID = spyID;
		spyCount++;
		
		System.out.println("This spy ID's is:" + spyID);
		System.out.println("There are " + spyCount + " spies");
	}
	
	
	public static void die(int spyID) {
		System.out.println("ÒSpy " + spyID + " has been detected and eliminated");
		spyCount--;
		System.out.println("There are " + spyCount + " spies");
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
	}
	
}