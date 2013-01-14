package books;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("Title First", "Author One");
		Book book2 = new Book("Title Second", "Author Two");
		Book book3 = new Book("Title Third", "Author Three");
		 
		book1.addCopy();
		book2.addCopy();
		book2.addCopy();
		
		int[] test2 = book2.getCopiesIds();
		
		for(int t : test2)
		{
			System.out.println(t);
		}
		
	}

}
