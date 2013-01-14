package books;

public class MockLibrary implements Libraries {
	
	private String libraryName = "Library Name";
	private int libraryID = 13;
	
	public String getLibary()
	{
		return libraryName;
	}
	
	public int getID()
	{
		return libraryID;
	}
	
	@Override
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMaxBooksPerUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void registerUser(LibraryUser user)
	{
	}
}
