package tree;

	/** 
	 * Complete the class IntegerTreeNode.
	 * From the notes, you already know what the member 
	 * fields are and you have seen a possible implementation of
	 * methods add(int) and contains(int). Implement as well 
	 * two methods getMax() and getMin() that returns the
	 * maximum and the minimum values stored in the tree.
	 * Compile the class and use it inside a script1 adding 
	 * numbers in different orderings.
	 *
	 */
public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	// working string
	public static String tostring = "[";
	
	//... methods would be here
	public IntegerTreeNode(int number)
	{
		value = number;
		left = null;
		right = null;
	}
	
	public void add(int newNumber) 
	{
		// greater turn RIGHT
		//
		if (newNumber > this.value) 
		{
			// first value on the right
			//
			if (right == null) 
			{
				right = new IntegerTreeNode(newNumber);
				
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
				left = new IntegerTreeNode(newNumber);
				
			// add one more to the right
			//
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) 
	{
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
	
	public void treeList(IntegerTreeNode node)
    {	
		/**
		 * it goes to the extreme left by calling the "left object" recurrently
		 * when there is none to the left, it print the value and then asks for the object 
		 * on the "right" if there is none it close and it continues executing the calling object
		 * then it executes the call to the right object of the object above an so on
		 * it only prints the objects on the right
		 * example:
		 *                      5      -> START: (5) get left node -> (3)
		 *                     / \               (3) get left node -> (1)
		 *                    3   \              (1) no left, print value and get right node -> (2)
		 *                   / \   \             (2) no left, print value -> no right, close (2), go up and close (1) go up, 
		 *                  1   4	10           (3) print value, get right node -> (4)
		 *                 / \     /  \          (4) no left, print value, no right, close (4) go up and close (3) go up,
		 *                x   2   8    x         (5) get right node -> (10) go left -> (8) go left -> (7) go left -> (6)
		 *                       / \             (6) no left, print value, no right, close (6), go up, 
		 *                      7   9            (7) print value, no right, close (7), go up
		 *                     /                 (8) print value, get right node -> (9)
		 *                    6                  (9) no left, print value, no right, close (9) go up,
		 *                                       (10) print value, no right, close (10) go up and close (5) END.
		 *          [5 L[3 L[1 L[] R[2 L[] R[]]] R[4 L[] R[]]] R[10 L[8 L[7 L[6 L[] R[]] R[]] R[9 L[] R[]]] R[]]] 
		 */                
		// get the left node
		//
		if(node != null)
    	{
    		if(node.getLeft() != null)
    		{
    			treeList(node.getLeft());
    		}
    	}
		// no more lefts! -> now print value and get the right
		//
    	if(node != null)
    	{
    		System.out.println("Node value: " + node.getValue());
    		/* 
    		if(node.getLeft() != null)
    		System.out.println("Node left: " + node.getLeft().getValue());
    		if(node.getRight() != null)
    		System.out.println("Node right: " + node.getRight().getValue());
    		System.out.println("+++++++++++++++++++++++++++++++++++"); 
    		*/
    		if(node.getRight() != null)
    		{
    			treeList(node.getRight());
    		}
    	}
    }
	
	public int getValue()
	{
		return value;
	}
	
	public IntegerTreeNode getLeft(){
		return left;
	}
	public IntegerTreeNode getRight(){
		return right;
	}
	//getMax()
	public int getMax()
	{
		if(this.getRight() != null)
		{
			//System.out.println("getRight: " + this.getValue());
			return this.getRight().getMax();
		}else{
			//System.out.println("getRight: " + this.getValue());
			return this.getValue();
		}
	}
	//getMin()
	public int getMin()
	{
    		if(this.getLeft() != null)
    		{
    			//System.out.println("getLeft: " + this.getValue());
    			return this.getLeft().getMin();
    		}else{
    			//System.out.println("getLeft: " + this.getValue());
    			return this.getValue();
    		}
	}
	
	public String toString()
	{	
		stringBuilder();
		String list = tostring + "]";
		tostring = "[";
		//System.out.println("\nreturn list:" + list);
		return list;
	}
	
	private void stringBuilder()
	{
		if(this != null)
    	{
			//System.out.print(this.getValue());
			tostring += Integer.toString(this.getValue()); 
			
			//System.out.print(" L[" );
			tostring += " L[";
			
    		if(this.getLeft() != null)
    		{
    			this.getLeft().stringBuilder();
    		}
    		//System.out.print("]");
    		tostring += "]";
    		
    		//System.out.print(" R[" );
    		tostring += " R[";
    		if(this.getRight() != null)
    		{
    			this.getRight().stringBuilder();
    		}
    		//System.out.print("]");
    		tostring += "]";
    	}
	}
	
	public int depth()
	{
		int left = 0;
		int right = 0;
		
		if(this != null)
    	{	
			while(this.getLeft() != null)
			{
				this.getLeft().getLeft();
			}
    		if(this.getRight() != null)
    		{
    			right++;
    			this.getRight();
    		}
    	}
		
		if(left > right){
			return left;
		}else{
			return right;
		}
	}
}





