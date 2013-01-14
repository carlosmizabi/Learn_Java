/**
 * 
 */
package books;

/**
 * @author carlosmarques
 *
 */
public interface Users {

	/**
	 * 
	 * Create a class for the users of the library.
	 * Users must have a name (string, unique) and library-ID (int , unique)
	 * The name is set at construction time but the ID is not
	 *
	 */
	
	/**
	* Get the user name.
	*
	*/
	public String getName();
	
	/**
	* Get the user ID.
	*
	*/
	public int getID();
	
	/**
	* Set the user ID.
	*
	* @param the id number to be set.
	*/
	public void setID(int userID);
	
	
}
