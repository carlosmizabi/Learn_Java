package instanceCounter;

	public class Spy {
	private static int spyCount = 0;
	
	public Spy() {
		spyCount++;
		// ...
	}
	public static int getNumberOfSpies() {
		return spyCount;
	}
}