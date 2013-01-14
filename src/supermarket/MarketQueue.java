package supermarket; 

public class MarketQueue implements PersonQueue {
	
	/**
     * The first person in the queue
     */
	private PersonNode first;
	private PersonNode last;
	private int COUNTER = 0;
	private int idCounter = 0;
	
	/**
	* Adds another person to the queue.
	*/
	public void insert(PersonNode newPerson)
	{
		COUNTER++;
		idCounter++;
		newPerson.setID(idCounter);
		// first person in kew
		if (first == null)
		{
			first = newPerson;
			last = newPerson;
		}
	    /** if head not empty (empty stack) then next links
	    * back to itself or the head/top element of the stack
	    */
	    if (first != null) {
	    	last.setNext(newPerson);
	    }
	    // new last
	    last = newPerson;
	  
	  /**
	   * Quando uma nova pessoa Ž inserida Ž ent‹o necess‡rio
	   * que esta ligue ˆ ultima, ao contrario da pilha, na qual
	   * o novo elemento fica no topo, na fila o novo elemento 
	   * fica no fim da fila (por detr‡s do anterior).
	   * 
	   * E1 
	   * E2 -> E1 : o ultimo ao proximo == novo e o novo proximo == null
	   * E3 -> E2 -> E1
	   */
	}
	/**
	* Removes a person from the queue.
	*/
	public PersonNode retrieve(){
		if (first == null){
			return null;
		}else{
			PersonNode ref = first;
			first = first.getNext();
			COUNTER--;
			return ref;	
		}
	}
	
	/**
	* checks whos is first in the queue.
	*/
	public PersonNode firstInQueue()
	{
		if (first == null) {
			return null;
		} else {
			return first;
		}
	}
	
	public PersonNode whosNext(PersonNode person)
	{
		if (first == null) {
			return null;
		} else {
			return person.getNext();
		}
	}
	
    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  // reference node starts by being equal to head
	  //
	  PersonNode PersonNode = first;
	  while (PersonNode != null) {
		  // assign the value of currentNode
		  // to be equal to the get next
		  // the first element pushed to the stack,
		  // AKA the bottom of the stack, doesn't
		  // have a next, hence == null
		PersonNode = PersonNode.getNext();
		result++;
	  }
	  return result;
    }
    
    public boolean isEmpty() {
  	  if (getSize() == 0) {
  		return true;
  	  } else {
  		return false;
  	  }
    }
    
    public void queueList(PersonNode person)
    {	
    	if(person != null)
    	{
    		System.out.println("Person ID: " + person.getID());
    		if(person.getNext() != null)
    		{
    			queueList(person.getNext());
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
}
