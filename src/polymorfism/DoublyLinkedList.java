package polymorfism;

import java.io.IOException;

public interface DoublyLinkedList{
	
	/**
	 * When a new node is added to the list 
	 * it is automatically assign an unique 
	 * index number.
	 * 
	 * @param the T content to store
	 * @return integer list index number 
	 */
	int add(String content);

	/**
	 * Removed node with the given index number.
	 * @param indexNumber 
	 * @return TRUE if successful else FALSE
	 */
	boolean remove(int indexNumber);
	
	/**
	 *  print on screen the nodes ids
	 */
	void list();
	
	/**
	 * Retrieve the node with a given index number.
	 * 
	 * @param indexNumber
	 * @return the "primitive"
	 */
	int get(int indexNumber);
	
	/**
	 * Return TRUE or FALSE if a node with
	 * the given index Number exists.
	 * @param indexNumber
	 * @return TRUE if successful else FALSE
	 */
	boolean exist(int indexNumber);
}
