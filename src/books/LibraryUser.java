package books;

import java.util.HashMap;
import java.util.Map;

public class LibraryUser implements Users {
	
	private String userName;
	private int userID;
	
	// library
	private Libraries library;
	private Map<Integer, Integer> borrowedItemsList;
	
	public LibraryUser(String userName)
	{
		this.userName = userName;
		borrowedItems = new HashMap<Integer, Integer>();
	}

	@Override
	public String getName() 
	{
		return userName;
	}

	@Override
	public int getID() 
	{
		return userID;
	}

	@Override
	public void setID(int userID) 
	{
		this.userID = userID;
	}

	public void register(Libraries library)
	{
		this.library = library;
		library.registerUser(this);
	}
	
	public Libraries getLibrary()
	{
		return library;
	}
	
	public boolean addBorrowedItem(int bookId, int copyId)
	//
	// It puts the book id and copy id in the borrowedItemsList
	{
		borrowedItemsList.put(bookId, copyId);
		return true;
	}
	
	public boolean removeBorrowedItem(int bookId, int copyId)
	//
	// remove a borrowed item given a book id and a copy id.
	{
		for(Integer books : borrowedItemsList.keySet())
		{
			if(bookId == books)
			{
				if(copyId == borrowedItemsList.get(books))
				{
					borrowedItemsList.remove(books);
				}
			}
		}
		return false;
	}
}
