package arrayToList;

public class Item{
	
	private static int itemCounter = 0;
	private int itemIndex;
	private int x;
	private Item itemPrev;
	private Item itemNext;
	boolean top = false;
	
	
	public Item(int x)
	{
		this.x = x;
		this.itemNext = null;
		this.itemPrev = null;
		itemCounter++;
		this.itemIndex =itemCounter;
	}
	
	public int getItem()
	{
		return x;
	}
	
	public int getIndex()
	{
		return itemIndex;
	}
	
	public int getCounter()
	{
		return itemCounter;
	}
	
	public Item getItemNext()
	{
		return itemNext;
	}
	
	public Item getItemPrev()
	{
		return itemPrev;
	}
	
	public Item setItemNext(Item item)
	{
		itemNext = item;
		return itemNext;
	}
	
	public Item setItemNPrev(Item item)
	{
		itemPrev = item;
		return itemPrev;
	}
}
