package tree;

import static org.junit.Assert.*;

import org.junit.Test;

import books.BookItem;

public class TestBookList {

	/** void addBook(String title, String author);
	* Add a book to the book list.
	*
	* @param book1 new book
	*/
	@Test
	public void TEST_addBook(String title, String author) {
		BookItem book = new BookItem("titulo 1", "Author One");
		book.addBook("titulo 2", "Author One");
		book.addBook("titulo 3", "Author One");
		book.addBook("titulo 4", "Author One");
		
		System.out.println("");
	}
	/** String getAuthor();
	* Finds the author given the title of the book.
	* And return a string.
	* @param title of the book
	*/
	@Test
	public void TEST_getAuthor() {
		fail("Not yet implemented");
	}
	
	
	/** String getTitle();
	* Finds the author given the title of the book.
	* And returns a string
	* @param author of the book
	*/
	@Test
	public void TEST_getTitle() {
		fail("Not yet implemented");
	}
	
	
	/** boolean deleteBook(BookList book);
	* Removes a book from the list
	*
	* @param book to be removed
	*/
	@Test
	public void TEST_deleteBook(BookItem book) {
		fail("Not yet implemented");
	}
	
	/** String findAuthor(String title);
	* Finds the author given the title of the book.
	* And return a string.
	* @param title of the book
	*/
	@Test
	public void TEST_findAuthor(String title) {
		fail("Not yet implemented");
	}
	
	/** String findTitle(String author);
	* Finds the author given the title of the book.
	* And returns a string
	* @param author of the book
	*/
	@Test
	public void TEST_findTitle(String author) {
		fail("Not yet implemented");
	}
	
	/** int bookCount(BookList book);
	* Returns the number of books which the list of 
	* a given book has in the form of an integer.
	*
	* @param book any book to initiate list count.
	*/
	@Test
	public void TEST_bookCount(BookItem book) {
		fail("Not yet implemented");
	}
	

}
