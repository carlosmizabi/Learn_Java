package books;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST_Library {

	@Test
	public void TEST_setGetMaxBooksPerUser() throws Exception
	{
		
		Libraries lib = new Library("Test Library");
		lib.setMaxBooksPerUser(3);
		int test = lib.getMaxBooksPerUser();
		int expected = 3;
		assertEquals(expected, test);
	}
	
	@Test
	public void TEST_registerUser() throws Exception
	{
		// Create a Library
		//
		Library lib = new Library("Test Library");
		
		// Create a user
		//
		LibraryUser user1 = new LibraryUser("User One");
		LibraryUser user2 = new LibraryUser("User Two");
		LibraryUser user3 = new LibraryUser("User Three");
		
		// Register library
		//
		user1.register(lib);
		user2.register(lib);
		user3.register(lib);
		
		// Now get the users Id
		//
		int test = user1.getID();
		int expected = 1;
		//
		// System.out.println("user1 id: " + test);
		//
		assertEquals(expected, test);
		//
		test = user2.getID();
		expected = 2;
		//
		// System.out.println("user2 id: " + test);
		assertEquals(expected, test);
		//
		test = user3.getID();
		expected = 3;
		//
		// System.out.println("user3 id: " + test);
		//
		assertEquals(expected, test);
		//
		
	
	}
	
	@Test 
	public void TEST_registerUniqueUserName() throws Exception
	{
		// Create a Library
		//
		Library lib = new Library("Test Library");
		
		// Create a user
		//
		LibraryUser user1 = new LibraryUser("User One");
		LibraryUser user2 = new LibraryUser("User One");
		LibraryUser user3 = new LibraryUser("User Three");
		
		// Register library
		//
		user1.register(lib);
		user2.register(lib);
		user3.register(lib);
		
		// Check if users exist by calling the values
		//
		String[] test = lib.listUsersName();
		String[] expected = {"User One", "User Three"};
		assertArrayEquals(expected, test);
	}
	
	@Test
	public void TEST_addGetBookGet() throws Exception
	{
		// Create a Library
		//
		Library lib = new Library("Test Library");
	
		// add book
		//
		lib.addBook("Primeiro Livro","Primeiro Autor");
		
		boolean test = lib.existsBook("Primeiro Livro");
		boolean expected = true;
		assertEquals(expected, test);
		
		// get non-existing book
		//
		test = lib.existsBook("No Book?");
		expected = false;
		assertEquals(expected, test);
		
		// try to add an existing book
		//
	    test = lib.addBook("Primeiro Livro","Primeiro Autor");
	    expected = false;
	    assertEquals(expected, test);
	}
	
	@Test
	public void TEST_takeBook() throws Exception
	{
		Library lib = new Library("Test Library");
		lib.addBook("Primeiro Livro","Primeiro Autor");
		
		boolean test = lib.takeBook("Test Library");
		boolean expected = true;
		assertEquals(expected, test);
		
	}
	
	@Test
	public void TEST_getBook() throws Exception
	{
		Library lib = new Library("Test Library");
		lib.addBook("Primeiro Livro","Primeiro Autor");
		Book book = lib.getBook("Primeiro Livro");
	    assertNotNull(book);
	}
	@Test
	public void returnBook()
	{
		
	}

}
