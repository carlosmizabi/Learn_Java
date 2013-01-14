/**
 * 
 */
package books;


public interface Books {
	
	/**
	 * Create a class for books. Books have authors and titles. 
	 * The class should implement getters for both author name
	 * and title, but these must be set at construction time and 
	 * never be modified afterwards.
	 */
	
	/**
	* Get the book title.
	*
	*/
	public String getTitle();
	
	/**
	* Get the book author.
	*
	*/
	public String getAuthor();
	

}
