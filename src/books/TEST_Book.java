/**
 * 
 */
package books;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * @author carlosmarques
 *
 */
public class TEST_Book {
	
	 private Book book1 = new Book("Title First", "Author One");
	 private Book book2 = new Book("Title Second", "Author Two");
	 private Book book3 = new Book("Title Third", "Author Three");

	@Test
	public void TEST_getTitle() throws Exception 
	{
		String title = book1.getTitle();
		String expected = "Title First";
		assertEquals(title, expected);
	}

	@Test
	public void TEST_getAuthor() throws Exception 
	{
		String title = book1.getAuthor();
		String expected = "Author One";
		assertEquals(title, expected);	
	}
	
	@Test
	public void TEST_addGetCopy() throws Exception
	{
		// book1 one copy
		// book2 two copies
		// book3 no copies
		//
		book1.addCopy();
		book2.addCopy();
		book2.addCopy();
		
		// Testing book1 
		//
		int[] test1 = book1.getCopiesIds();
		int[] expected1 = {1};
		assertArrayEquals(test1, expected1);
		//
		// Testing book2
		//
		int[] test2 = book2.getCopiesIds();
		int[] expected2 = {1,2};
		assertArrayEquals(test2, expected2);
		//
		// Testing book2
		//
		int[] test3 = book3.getCopiesIds();
		assertNull(test3);
	}
	
	
	@Test
	public void TEST_getNumberOfCopies() throws Exception
	{
		// book1 one copy
		// book2 two copies
		// book3 no copies
		//
		book1.addCopy();
		book2.addCopy();
		book2.addCopy();
		
		int test = book1.getNumberOfCopies();
		int expected = 1;
		assertEquals(expected, test);
		
		test = book2.getNumberOfCopies();
		expected = 2;
		assertEquals(expected, test);
		
		test = book3.getNumberOfCopies();
		expected = 0;
		assertEquals(expected, test);
	}
	
	@Test
	public void TEST_removeCopy() throws Exception
	{
		// book1 one copy
		// book2 two copies
		// book3 no copies
		//
		book1.addCopy();
		book1.removeCopy(1);
		
		
		int test = book1.getNumberOfCopies();
		int expected = 0;
		assertEquals(expected, test);
		
		book2.addCopy();
		book2.addCopy();
		book2.removeCopy(2);

	    test = book2.getNumberOfCopies();
		expected = 1;
		assertEquals(expected, test);
		
		book3.removeCopy(1);
	    test = book3.getNumberOfCopies();
		expected = 0;
		assertEquals(expected, test);
		
	}
	
	@Test
	public void TEST_getCopy() throws Exception
	{
		//
		book1.addCopy();
		//
		boolean test = book1.getCopy(1);
		boolean expected = false;
		assertEquals(expected, test);
		//
		//----------------------------------
		book2.addCopy();
		book2.addCopy();
		//
		test = book2.getCopy(2);
		expected = false;
		assertEquals(expected, test);
		//
		//----------------------------------
		
		test = book3.getCopy(0);
		expected = false;
		assertEquals(expected, test);
		
	}
	
	@Test
	public void TEST_borrowCopy() throws Exception
	{
		book2.addCopy();
		book2.addCopy();
		
		boolean test = book2.borrowCopy(2);
		boolean expected = true;
		assertEquals(expected, test);
		//
		//----------------------------------
		// testing the borrowed copy
		//
		test = book2.borrowCopy(2);
		expected = false;
		assertEquals(expected, test);
		//
		//----------------------------------
		// testing the non-existing copies
		// under (0) and over (3)
		//
		test = book2.borrowCopy(3);
		expected = false;
		assertEquals(expected, test);
		//
		test = book2.borrowCopy(0);
		expected = false;
		assertEquals(expected, test);
	}
	
	@Test 
	public void TEST_returnCopy() throws Exception
	{
		book2.addCopy();
		book2.addCopy();
		book2.borrowCopy(2);
		
		boolean test = book2.returnCopy(2);
		boolean expected = true;
		assertEquals(expected, test);
		//
		//----------------------------------
		// test borrowing a returned book
		//
		test = book2.borrowCopy(2);
		expected = true;
		assertEquals(expected, test);
		//
		//----------------------------------
		// testing the non-existing copies
		// under (0) and over (3)
		//
		test = book2.returnCopy(3);
		expected = false;
		assertEquals(expected, test);
		//
		test = book2.returnCopy(0);
		expected = false;
		assertEquals(expected, test);
	}
}
