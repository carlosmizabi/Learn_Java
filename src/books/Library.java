package books;

import java.util.HashMap;
import java.util.Map;

public class Library implements Libraries {

	private String libraryName;
	private int maxBooksPerUser;
	
	// Library Users
	//
	private Map<Integer, LibraryUser> userList;
	private int highestUserId;
	
	// Library Books
	//
	private Map<Integer, Book> bookList;
	private int highestBookId;
	
	public Library(String libraryName)
	{
		this.libraryName = libraryName;
		userList = new HashMap<Integer, LibraryUser>();
		bookList = new HashMap<Integer, Book>();
		highestUserId = 1;
		highestBookId = 1;
	}
	
	private int idGenerator(String type)
	//
	// Get the highest user id, increase it and 
	// return it. The @param type determines
	// if we are working with a USER or a BOOK.
	// If the type is entered incorrectly it 
	// will return 0.
	{
		type = type.toUpperCase();
		
		if (type.equals("USER")){
			return highestUserId++;
		}else if(type.equals("BOOK")){
			return highestBookId++;
		}
		return 0;
	}
	
	//////////////////////////////////////////////////////
	//
	//   USERS
	//
	//////////////////////////////////////////////////////
	
	public void setMaxBooksPerUser(int maxBooksPerUser)
	{
		this.maxBooksPerUser = maxBooksPerUser;
	}

	public int getMaxBooksPerUser()
	{
		return maxBooksPerUser;
	}
	
	public int getId(String userName)
	{
		//iterating over values 
		for (LibraryUser value : userList.values()) 
		{
			if(value.getName() == userName) return value.getID();
		}
		return 0;
	}
	

	
	public void registerUser(LibraryUser user)
	{
		if (uniqueUserName(user.getName()) == false)
		{
			// Set the user id to highest++ id in 
			// the library
			//
			user.setID(idGenerator("USER"));
			
			// Add the user to the HashMap
			//
			userList.put(user.getID(), user);
		}
	}
	
	public String[] listUsersName()
	{
		String[] array = new String[userList.size()];
		int i = 0;
		
		//iterating over values only
		for (LibraryUser value : userList.values()) 
		{
			array[i] = value.getName();
		    i++;
		}
			
		return array;
	}
	
	
	private boolean uniqueUserName(String name)
	{
		//iterating over values 
		for (LibraryUser value : userList.values()) 
		{
			if(value.getName() == name) return true;
		}
		return false;
	}
	
	
	//////////////////////////////////////////////////////
	//
	//   BOOKS 
	//
	//////////////////////////////////////////////////////
	
	public Book getBook(String title)
	{
		for(Book book : bookList.values())
		{
			if(book.getTitle() == title)
			{
				return book;
			}
		}
		return null;
	}
	
	public boolean addBook(String title, String author)
	//Adds a new book to the list of books in this library.
	{
		Book book = new Book(title,author);
		
		if (bookExists(title,author) == false){
			book.addCopy();
			bookList.put(idGenerator("BOOK"), book);
			return true;
		}
		return false;
		
	}

	public boolean existsBook(String title)
	//
	// If the bookList is not empty ask if the book
	// exists titleExists(string):boolean.
	{
		if(bookList.isEmpty() == false){
			if(titleExists(title) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean titleExists(String title)
	//
	// iterate over the books in the bookList
	// and checks if a title exists
	{
		for(Book iterator : bookList.values())
		{
			if(iterator.getTitle() == title)
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean bookExists(String title, String author)
	//
	// It checks if the combination of title and author exists
	// in any book in the map bookList. 
	// If it does it return true else false.
	{
		for(Book iterator : bookList.values())
		{
			if(iterator.getAuthor() == author 
				& iterator.getTitle() == title)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean takeBook(String title)
	//
	// If the book is not taken, marks the book as taken
	// and returns it. If the book is taken,
	// null is returned.
	{
		if(existsBook(title) == true)
		{
			
		}
		return false;
	}
	
	public void returnBook(Book book)
	//
	//Marks the book as not taken.
	{
		
	}

}
