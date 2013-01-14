package supermarket;

public class PersonNode {
	
	private int id;
	private PersonNode next;
	

	public PersonNode()
	{
		id = 0;
		next = null;
	}
	
	 /**
     * Set the next node to point to the given node
     */
    public void setNext(PersonNode person) {
	  next = person;		
    }
    
    public void setID(int id)
    {
    	this.id = id;
    }
    /**
     * Set the next node to point to the given node
     */
    public PersonNode getNext() {
	  return next;		
    }
    
    public int getID()
    {
    	return id;
    }
	
}
