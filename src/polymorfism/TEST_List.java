package polymorfism;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST_List {

	@Test
	public void test() {
		List<String> list = new List<String>(":ListName");
		list.add("Primeiro");
		list.add("Segundo");
		list.add("Terceiro");
		list.add("Quarto");
		list.add("Quinto");
		list.add("Sexto");
		list.add("Stimo");
		list.add("Oitavo");
		list.add("Nono");
		list.add("Dcimo");
		
		Boolean test = list.exist(1);
		assertTrue(test);
		
		test = list.remove(1);
		assertTrue(test);
		
		int testInt = list.getSize();
		int expectedInt = 9;
		assertEquals(expectedInt, testInt);
		
		//String testS = list.getNext().getContent();
		//String expectedS = "Segundo";
		//assertEquals(expectedS, testS);
		
		list.list();
		
		List<String> list2 = new List<String>(":ListName");
		list2.add("K");
		list2.add("J");
		list2.add("O");
		list2.add("P");
		
		list2.list();
		
	}

}
