package tree;

public class ListIntSet implements IntSet {

	private static int counter = 0;
	private static String tostring = "";
	private int itemIndex;
	private int value;
	private ListIntSet next;
	private ListIntSet prev;
	
	public ListIntSet(int newValue) 
	{
		value = newValue;
		next = null;
		prev = null;
		counter++;
		itemIndex = counter;
	}
	
	// GETTERS
	//
	public int getValue()
	{
		return value;
	}
	//
	public ListIntSet getNext(){
		return next;
	}

	@Override
	public void add(int newValue) 
	{
		if (this.next == null) {
			// this means this is the last patient in the list
			this.next = new ListIntSet(newValue);
			this.next.prev = this;
		} else {
			this.next.add(newValue);
		}
	}

	@Override
	public boolean contains(int value) {
		
		if(this.itemIndex < counter){
			if (value == this.value) {
				return true;
			}else{
				return this.next.contains(value);
			}
		}else{
			return false;
		}
	}

	@Override
	public boolean containsVerbose(int number) 
	{
		System.out.print("...");
		if(this.itemIndex < counter){
			if (number == this.value) {
				System.out.print(value + " -> Fount it.");
				return true;
			}else{
				System.out.println(value);
				return this.next.containsVerbose(number);
			}
		}else{
			System.out.print(value);
			return false;
		}
	}
	
	public void listNodes()
	{
		if(this.next != null){
			System.out.println(" -> " + this.value);
			/**
			System.out.println(". . . . . . . . . . . . . . . . ");
			System.out.println("NEXT >> " + this.next.value);
			if(this.prev != null) 
				{ System.out.println("PREV << " + this.prev.value); }
			*/	
			this.next.listNodes();
		}else{
			System.out.println(" -> " + this.value);
			/**
			System.out.println(". . . . . . . . . . . . . . . . ");
			System.out.println("NEXT Patient >> " + this.next);
			System.out.println("PREV << " + this.prev.value);
			System.out.println("--------------------------------");
			*/
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
		if(this != null && this.itemIndex < counter)
    	{
			tostring += Integer.toString(this.getValue()); 
			tostring += ",";
			
    		if(this.getNext() != null)
    		{
    			this.getNext().stringBuilder();
    		}
    	}
	}

}
