package maps;

public class MapNode implements SimpleMap {
	
	/**
	* Puts a new String in the map.
	*
	* If the key is already in the map, nothing is done.
	*/
	public String put(int key, String name){
		
		Node newNode = new Node(key, name);
	
	return name;
		
	}
	/**
	* Returns the name associated with that key,
	* or null if there is none.
	*/
	public String get(int key){
		
		return null;
	}
	/**
	* Removes a name from the map. Future calls to get(key)
	* will return null for this key unless another
	* name is added with the same key.
	*/
	public void remove(int key){
		
	}
	/**
	* Returns true if there are no workers in the map,
	* false otherwise
	*/
	public boolean isEmpty(){
		
		
		return false;
	}
	
	
}
