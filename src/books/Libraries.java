/**
 * 
 */
package books;

/**
 * @author carlosmarques
 *
 */
public interface Libraries {

	/**
	* Set the maximum number of books a user is 
	* allowed to borrow.
	*
	* @param maximum number of books
	*/
	public void setMaxBooksPerUser(int maxBooksPerUser);
	
	/**
	* Get  the maximum books a user is allowed to borrow.
	*
	*/
	public int getMaxBooksPerUser();
	
	public void registerUser(LibraryUser user);
}
