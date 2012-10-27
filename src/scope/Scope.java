package scope;

public class Scope {

	public static void main(String[] args) {
		

	}

}
class UnitMatrix {
    int size; // visible to all members of class

	void setSize(int newSize) { 
	 this.size = newSize; // visible to this method
	}
    void print() {
	 for (int i = 0; i < size; i++) { // i visible in the for loop
		  for (int j = 0; j < size; j++) { // j visible to this for loop
			  if (i == j) {
				  System.out.println("1 ");
			  } else {
				  System.out.println("0 ");
			  }
	     }
     System.out.println ("");
	 }
	}
}