package inheritance;

public class MainTest {

	public static void main(String [] args)
	{
		System.out.println("Hello World: MainTest");
		MobilePhone fone = new MobilePhone("Apple");
		fone.call("01");
		fone.call("02");
		fone.call("03");
		fone.call("04");
		fone.call("05");
		fone.call("06");
		fone.call("07");
		fone.call("08");
		fone.call("09");
		fone.call("10");
		fone.call("11");
		
		fone.printLastNumbers();
		
		
	}
	
	
	

}
