package inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Phones {
	
	@Test
	public void TEST_PHONE() throws Exception {
		
		// test variables
		//
		String test;
		String expected;
		
		// TESTS
		//
		OldPhone oFone = new OldPhone("Ericson");
		test = oFone.testCall("111222333444");
		expected = "Calling 111222333444";
		assertEquals(expected, test);
		
		
		MobilePhone mFone = new MobilePhone("Sony");
		test = mFone.testCall("999888777666");
		expected = "Calling 999888777666";
		assertEquals(expected, test);
		
	}
	
	@Test
	public void TEST_sizeOfList() throws Exception
	{
		MobilePhone mFone = new MobilePhone("Sony");
		mFone.call("9999");
		int test = mFone.sizeOfList();
		int expected = 1;
		assertEquals(expected, test);
		
	}
	
	@Test 
	public void TEST_addNumbersToList() throws Exception
	{
		MobilePhone mFone = new MobilePhone("Toshiba");
		mFone.call("01");
		mFone.call("02");
		mFone.call("03");
		mFone.call("04");
		mFone.call("05");
		mFone.call("06");
		mFone.call("07");
		mFone.call("08");
		mFone.call("09");
		mFone.call("10");
		mFone.call("11");
		int test = mFone.sizeOfList();
		int expected = 10;
		assertEquals(expected, test);
		
		// Now lets get the head of the list
		String test01 = mFone.lastNumberCalled();
		String expected01 = "11";
		assertEquals(expected01, test01);
	}
}











