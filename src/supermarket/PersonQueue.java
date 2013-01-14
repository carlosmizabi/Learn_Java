/**
 * 
 */
package supermarket;

public interface PersonQueue {
	
	/**
	* Adds another person to the queue.
	*/
	void insert(PersonNode person);
	
	/**
	* Removes a person from the queue.
	*/
	PersonNode retrieve();
	
	/**
	 * Check who's the first Person 
	 * in the queue
	 */
	PersonNode firstInQueue();
	
	/**
	 * Check who's the first Person 
	 * in the queue
	 */
	PersonNode whosNext(PersonNode person);
	
	/**
	 * Check if the queue is not empty 
	 */
	boolean isEmpty();
	
	/**
	 * list Persons in queue 
	 */
	void queueList(PersonNode person);
	
}