package polymorfism;

/**
 * The List is made up at construction of an "empty node".
 * This empty node sets the list name and has the entry
 * point to the list where its "next" node is the "first" node.
 * The "empty node" does not have a null "prev" node and this is used as
 * a sentinel in iteration to ignore the empty node which is needed
 * for recursive methods. All content nodes can be removed and the 
 * list remains as empty list.
 * 
 */

public class List implements DoublyLinkedList {

	// List variables
	//
	private static String name;
	private static List emptyNode;
	private static List first = null;
	private static int size = 0;
	private static int index = 0;
	
	// Node variables
	//
	private int key = 0;
	private List next;
	private List prev;
	
	// Node content
	//
	private String content;
	
	private List()
	{
		//empty
	}
	
	public List(String name)
	{
		emptyNode = this;
		setName(name);
		this.setNext(first);
	}
	
	/**++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 *  PUBLIC 
	 *  		GETTERS
	 *					 1 - getKey() : int
	 *					 2 - getContent : String
	 *					 3 - getSize() : int
	 *					 4 - get(int) : int < @Override
	 *			SETTERS:
	 *					 -----
	 *			METHODS:
	 *					 5 - add(String) : int < @Override
	 *					 6 - exist(int) : boolean < @Override
	 *					 7 - empty() : boolean
	 *					 8 - remove(int) : boolean < @Override
	 *					 9 - list() : void < @Override
	 *  
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	//+++++++++++++++++++++++++
	//  PUBLIC GETTERS 
	//+++++++++++++++++++++++++
	
	//+++++
	//	1
	//+++++

	public int getKey()
	{
		return key;
		
	}
	
	//+++++
	//	3
	//+++++
	
	public String getContent()
	{
		return this.content;
	}
	
	//+++++
	//	3
	//+++++
	
	public int getSize()
	{
	return size;
	}
	
	//+++++
	//	4
	//+++++
	
	@Override
	public int get(int indexNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//+++++++++++++++++++++++++
	//  PUBLIC SETTERS 
	//+++++++++++++++++++++++++
	
	//+++++++++++++++++++++++++
	//  PUBLIC METHODS 
	//+++++++++++++++++++++++++
	
	//+++++
	//	5
	//+++++
	
	@Override
	public int add(String content) 
	{
		List x = createNode(content);
		
		if(empty() == true)
		{
			setFirst(x);
		}
		
		// Plug it 
		//
		x.setPrev(first.prev);
		x.setNext(first);
		first.prev.setNext(x);
		first.setPrev(x);
		size++;
		return x.getKey();
	}

	//+++++
	//	6
	//+++++
	
	@Override
	public boolean exist(int indexNumber) 
	{		
		if(this.empty() == false){
			
			if(this.key != 0)
			{
				if(this.key != indexNumber 
						&& this.next != first)
				{
					return this.next.exist(indexNumber);
				}else{
					return true;
				}
				
			}else{
				return first.exist(indexNumber);
			}
		}else{
			return false;
		}
	}
	
	//+++++
	//	7
	//+++++
	
	public boolean empty()
	{
		if(first == null){
			return true;
		}else{
			return false;
		}
	}
	
	//+++++
	//	8
	//+++++
	
	@Override
	public boolean remove(int key)
	{
		if(this.empty() == true)
		{
			return false;
		}
		
		if(this == emptyNode)
		{
			return first.remove(key);
		}
		
		// do the KEYS MATCH (?)
		// TRUE
		//
		if(this.key == key )
		{
			// is there MORE THAN ONE (?)
			// TRUE
			//
			if(getSize() > 1)
			{
				if(this == first)
				{
					setFirst(this.next);
				}
				this.deleteNode();
				
			// is THIS the FIRST node (?)
			// FALSE
			//
			}else{
				unsetFirst();
			}
			size--;
			return true;
			
		// do the KEYS MATCH (?)
		// FALSE > if NEXT NOT FIRST > get next
		//
		}else if (this.next != first){
			return this.next.remove(key);
			
		// do the KEYS MATCH (?)
		// FALSE > THIS IS LAST NODE > EXIT
		//
		}else{
			return false;
		}
			
	}
	
	//+++++
	//	9
	//+++++
	
	@Override
	public void list() {

		if (empty() == false)
		{		    			 
			 // is NOT LAST node && NOT EMPTY node
			 // TRUE && TRUE
			 //
			 if(this != first.prev && this.prev != null)	 
			 {	 
				 //System.out.println("NODES: ");
				 this.print();
				 this.getNext().list(); // RECURSION
				 
			 // NOT EMPTY node
			 // TRUE
			 //
			 }else if(this.getPrev() != null)
			 {	
				 //System.out.println("LAST: ");
				 this.print();
				 
			 // NOT EMPTY node
			 // FALSE
			 //
			 }else{		
				 // get FIRST instead
				 //
				 System.out.println("List: ");
				 this.getNext().list(); 
			 }
		}
	}
	
	//-----
	//	10
	//-----
	
	public boolean equals(List node)
	{
		if(this.content.equals(node.content))
		{
			return true;
		}else{
			return false;
		}
	}
	
	/**----------------------------------------------------------
	 * ----------------------------------------------------------
	 * 
	 * PRIVATE 
	 * 			GETTERS:
	 *					 1 - getNext() : List
	 *					 2 - getPrev() : List
	 *			SETTERS:
	 *					 3 - setName(String) : void
	 *					 4 - setFirst(List) : void
	 *					 5 - unsetFirst() : void
	 *					 6 - setContent(String) : void
	 *					 7 - setNext(List) : void
	 *					 8 - setPrev(List) : void
	 *					 9 - setKey() : int
	 *			METHODS:
	 *					10 - createNode(String) : List
	 *					11 - equals(List) : boolean
	 *					12 - deleteNode() : void
	 *					13 - print() : void
	 *					14 - emptyNode() : boolean
	 *
	 * 
	 *----------------------------------------------------------
	 *----------------------------------------------------------*/
	
	//-------------------------
	//  PRIVATE GETTERS 1-2
	//-------------------------
	
	//-----
	//	1
	//-----
	
	public List getNext()
	{
		return this.next;
	}
	
	//-----
	//	2
	//-----
	
	private List getPrev()
	{
		return this.prev;
	}

	
	//-------------------------
	//  PRIVATE SETTERS 3-9
	//-------------------------
	
	//-----
	//	3
	//-----
	
	private static void setName(String listName)
	{
		name = listName;
	}
	
	//-----
	//	4
	//-----
	
	private void setFirst(List newNode)
	{
		first = newNode;
		emptyNode.setNext(first);
		
		if(first.next == null)
		{
			first.setNext(first);
			first.setPrev(first);
		}
	}
	
	//-----
	//	5
	//-----
	
	private void unsetFirst()
	{
		first = null;
		emptyNode.next = null;
	}
	
	//-----
	//	6
	//-----
	
	private void setContent(String content)
	{
		this.content = content;
	}
	
	//-----
	//	7
	//-----
	
	private void setNext(List next)
	{
		this.next = next;
	}
	
	//-----
	//	8
	//-----
	
	private void setPrev(List prev)
	{
		this.prev = prev;
	}

	//-----
	//	9
	//-----
	
	private int setKey()
	{
		index++;
		return this.key = index;

	}
	
	//-------------------------
	//  PRIVATE METHODS 10-14
	//-------------------------
	
	//-----
	//	10
	//-----

	private List createNode(String content)
	{
		List x = new List();
		x.setContent(content);
		x.setKey();
		return x;
	}
	
	
	//-----
	//	12
	//-----
	
	private void deleteNode()
	{
		this.prev.next = this.next;
		this.next.prev = this.prev;
		this.prev = null;
		this.next = null;
	}

	//-----
	//	13
	//-----

	private void print()
	{
		System.out.println("Item : " + this.key + " = \"" + this.content + "\"");
	}
	
	//-----
	//	14
	//-----
	
	private boolean emptyNode()
	{
		if(this.prev == null)
		{
			return true;
		}else{
			return false;
		}
	}

}
