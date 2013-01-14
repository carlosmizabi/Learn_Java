package books;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TEST_LibraryUser {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TEST_getName() throws Exception
	{	
		Users user = new LibraryUser("First User");
		String expected = "First User";
		String test = user.getName();
		assertEquals(expected, test);
	}
	
	@Test
	public void TEST_setGetID() throws Exception
	{	
		Users user = new LibraryUser("First User");
		user.setID(01);
		int expected = 01;
		int test = user.getID();
		assertEquals(expected, test);
	}

	@Test
	public void TEST_registerGetLibrary() throws Exception
	{
		// create a user
		//
		LibraryUser user1 = new LibraryUser("First User");
		
		// create a mock library instance
		//
		Libraries lib = new MockLibrary();
		
		// register library in user
		//
		user1.register(lib);
		
		// get the library from user
		//
		Libraries test = user1.getLibrary();
		
		// check if they match
		//
		assertEquals(lib, test);
		
	}
}
