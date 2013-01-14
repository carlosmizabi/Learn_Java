package polymorfism;

import static org.junit.Assert.assertEquals;

public class main_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new List(":ListName");
		list.add("Primeiro");
		list.add("Segundo");
		list.add("Terceiro");
		list.add("Quarto");
		list.add("Quinto");
		list.add("Sexto");
		list.add("SŽtimo");
		list.add("Oitavo");
		list.add("Nono");
		list.add("DŽcimo");
		
		int test;
		if(list.exist(1) == true)
		{ test = 1; }
		else {test = 2; }
		int expected = 1;
		assertEquals(expected, test);
		
		//list.remove(1);
		
		//list.list();

	}
	
	private boolean exist(int indexNumber) 
	{
		System.out.println("this.getKey() " + this.getKey());
		
		// is the List EMPTY (?)
		// FALSE
		//
		if(empty() == false)
		{ 
			// System.out.println("1.0");

		    // is this KEY == to indexNumber
			// TRUE
			//
			if(this.key == indexNumber)
			{ 
				// System.out.println("2.0: TRUE");
				return true;
			
			// is this KEY == to indexNumber
			// FALSE
			//
			}else{ 
				// System.out.println("3.0");

				if(this != first.prev)
				{ 
					//System.out.println("4.0");
					this.getNext().exist(indexNumber);
					return false;
					
				}else{
				//System.out.println("5.0");
					return false;
				}
			}
			
		// is the List EMPTY (?)
		// TRUE
		//
		}else{ 
			// System.out.println("6.0");s
			return false;
		}
	}

}
