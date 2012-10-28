package copyingArrays;


public class ArrayCopier {
	
	//reference or pointer fields
	private int[] src;
	private int[] dst;
	
	
	///////////////////////////////////////////////////////////
	// Constructor
	//////////////////////////////////////////////////////////
	public ArrayCopier(int[] first, int[] second) {
		
		// where they are pointing to
		src = first;
		dst = second;
		
	}

	///////////////////////////////////////////////////////////
	// copy()
	//////////////////////////////////////////////////////////
	public void copy()
	{
	
		int counter = 0;
		for (int k = 0; k <= dst.length-1; k++){
			
			if(counter <= src.length-1){
				dst[k] = src[k];
			}else if (counter <= dst.length-1){
				dst[k] = 0;
			}
			counter++;
		}
		
		
		System.out.println("Second Array");
		for (int j = 0; j < dst.length; j++){
			System.out.print(dst[j] + " | ");
		}  
		
	} // \\\\\\\\\\\\\\\\\\\ //
	
	
}
