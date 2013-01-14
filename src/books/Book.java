package books;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Book implements Books {

	
	// Content Variables
	//
	private final String title;
	private final String author;
	//
	// Every book gets a map of copies with
	// an id and a borrowing state value.
	// Every copy gets a unique number
	// the id only increments even if one
	// is removed.
	//
	private Map<Integer, Boolean> copies;
	private int highestCopyId;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		copies = new HashMap<Integer, Boolean>();
		highestCopyId = 1;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}
	
	public void addCopy()
	//
	// it "increments" the copies map with one more copy.
	{
		copies.put(idGenerator(), false);
	}
	
	private int idGenerator()
	//
	// get the highest user id, increase it and return it.
	{
		return highestCopyId++;
	}
	
	public int[] getCopiesIds()
	//
	// It returns an array with all the copies ids
	// that exist for this book.
	{
		if(copies.size() != 0)
		{
			int i = 0;
			int[] array = new int[copies.size()];
			//iterating over keys only
			for (Integer key : copies.keySet()) {
			    array[i] = key;
			    i++;	
			}
			return array;
		}
		
		return null;
	}
	
	public int getNumberOfCopies()
	//
	// It returns the size of the copies map
	// (how many copies exists for this book).
	{
		return copies.size();
	}
	
	public void removeCopy(int key)
	{
		if (copies.containsKey(key))
		{
			copies.remove(key);
		}
	}
	
	public boolean getCopy(int key)
	//
	// Does a copy exist in the copies map?
	{
		if (copies.containsKey(key))
		{
			boolean value = copies.get(key);
			return value;
		}
		return false;
	}
	
	public boolean borrowCopy(int key)
	//
	// Take a key and find it on the copies map.
	// If there is a copy available(false), borrow it.
	// Return true if successful else return false.
	{
		if(copies.containsKey(key))
		{
			if(copies.get(key) == false)
			{
				copies.put(key, true);
				return true;	
			}
		}
		return false;
	}

	public boolean returnCopy(int key)
	//
	// It takes a key, finds the copy in the copies map
	// and set the boolean(borrowing state) to false.
	// If successful return true else return false.
	{
		if(copies.containsKey(key))
		{
			if(copies.get(key) == true)
			{
				copies.put(key, false);
				return true;	
			}
		}
		return false;
	}
	
	private int availableCopy()
	//
	// It returns the first available copy.
	// If none is available it will return 0
	{
		for (Integer key : copies.keySet()) {
		    if(copies.get(key) == false)
		    {
		    	return key;
		    }
		}
		return 0;
	}
}
