package tree;

/**
 * Create a class TreeIntSet that implements this interface 
 * based on a tree structure.
 */

public class TreeIntSet implements IntSet {

	// tree variable
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	private static String tostring = "";
	
	// Constructor
	//
	public TreeIntSet(int newValue)
	{
		value = newValue;
		left = null;
		right = null;
	}
	
	// GETTERS
	//
	private TreeIntSet getLeft(){
		return left;
	}
	//
	private TreeIntSet getRight(){
		return right;
	}
	//
	private int getValue()
	{
		return value;
	}
	
	@Override
	public void add(int newNumber) {
		
		// greater turn RIGHT
		//
		if (newNumber > this.value) 
		{
			// first value on the right
			//
			if (right == null) 
			{
				right = new TreeIntSet(newNumber);
				
			// add one more to the right
			//
			} else {
				right.add(newNumber);
			}
		// smaller turn LEFT
		//
		} else {
			
			// first value on the left
			//
			if (left == null) 
			{
				left = new TreeIntSet(newNumber);
				
			// add one more to the right
			//
			} else {
				left.add(newNumber);
			}
		}

	}

	@Override
	public boolean contains(int n) {
		if (n == this.value) 
		{
			return true;
		} else if (n > this.value) 
		{
			if (right == null) 
			{
				return false;
			} else {
				return right.contains(n);
		}
		} else {
			if (left == null) 
			{
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	@Override
	public boolean containsVerbose(int n) {
		
		System.out.print("...");
		if (n == this.value) 
		{
			System.out.println(this.value + " -> Fount it.");
			return true;
		} else if (n > this.value) 
		{
			if (right == null) 
			{
				return false;
			} else {
				System.out.print(this.value);
				return right.containsVerbose(n);
		}
		} else {
			if (left == null) 
			{
				return false;
			} else {
				System.out.print(this.value);
				return left.containsVerbose (n);
			}
		}
	}
	
	public String toString()
	{
		stringBuilder();
		String list = tostring;
		tostring = "";
		//System.out.println("\nreturn list:" + list);
		return list;
	}
	
	private void stringBuilder()
	{
		if(this != null)
    	{
			tostring += Integer.toString(this.getValue()); 
			tostring += ",";
			
    		if(this.getLeft() != null)
    		{
    			this.getLeft().stringBuilder();
    		}
    		if(this.getRight() != null)
    		{
    			this.getRight().stringBuilder();
    		}
    	}
	}
	
	public void treeList()
    {	               
		// get the left node
		//
		if(this != null)
    	{
    		if(this.getLeft() != null)
    		{
    			this.getLeft().treeList();
    		}
    	}
		// no more lefts! -> now print value and get the right
		//
    	if(this != null)
    	{
    		System.out.println("Node value: " + this.getValue());
    		if(this.getRight() != null)
    		{
    			this.getRight().treeList();
    		}
    	}
    }

}
